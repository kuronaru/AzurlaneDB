package server;

/**
 * �������߳��࣬����ͻ��˵�����
 * @author ½�ҿ�
 * @date 2021��4��28��
 */

import java.io.IOException;
import java.net.Socket;
import java.sql.ResultSet;

import db.DBHelper;
import msg.*;

public class ServerThread extends Thread {
	private Socket socket;
	private Msg msg = new Msg();

	private String account = "kuronaru";
	private String password = "114514";

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	protected void Login() throws Exception {
		LoginMsg login = (LoginMsg) msg.readMsg(socket);
		String reply;
		if (login.getAccount().equals(account) && login.getPassword().equals(password)) {
			reply = "��½�ɹ�";
			System.out.println("��½�ɹ�");
		} else {
			reply = "��½ʧ��";
			System.out.println("��½ʧ��");
		}
		msg.sendMsg(socket, reply);
	}

	protected void SearchWarship() throws Exception {
		DBHelper db = new DBHelper();
		String signal = null;
		String table1 = "������Ϣ";
		String table2 = "��������";
		String search = (String) msg.readMsg(socket);
		ResultSet rs1 = null;
		if (!search.equals("")) {
			String cond1 = new String("������ like '%" + search + "%'");
			rs1 = db.select("*", table1, cond1);
		} else {
			rs1 = db.select("*", table1);
		}
		while (rs1.next()) {
			signal = "next";
			msg.sendMsg(socket, signal);
			String cond2 = new String("��� = " + new Integer(rs1.getInt(3)).toString());
			ResultSet rs2 = db.select("*", table2, cond2);
			if (rs2.next()) {
				WarshipInfoMsg info = new WarshipInfoMsg(rs1.getString(1), rs1.getString(2), rs1.getInt(3),
						rs1.getString(4), rs1.getString(5), rs1.getString(6), rs2.getInt(3), rs2.getString(4),
						rs2.getInt(5), rs2.getInt(6), rs2.getInt(7), rs2.getInt(8), rs2.getInt(9), rs2.getInt(10),
						rs2.getInt(11), rs2.getInt(12), rs2.getInt(13), rs2.getInt(14));
				msg.sendMsg(socket, info);
			}
		}
		signal = "over";
		msg.sendMsg(socket, signal);
	}

	protected void SearchWeapon() throws Exception {
		DBHelper db = new DBHelper();
		String signal = null;
		String table = "װ����Ϣ";
		String search = (String) msg.readMsg(socket);
		ResultSet rs = null;
		if (!search.equals("")) {
			String cond1 = new String("���� like '%" + search + "%'");
			rs = db.select("*", table, cond1);
		} else {
			rs = db.select("*", table);
		}
		while (rs.next()) {
			signal = "next";
			msg.sendMsg(socket, signal);
			WeaponInfoMsg weapon = new WeaponInfoMsg(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
					rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15));
			msg.sendMsg(socket, weapon);
		}
		signal = "over";
		msg.sendMsg(socket, signal);
	}

	protected void SearchWW() throws Exception {
		DBHelper db = new DBHelper();
		String signal = null;
		String table = "����װ��";
		String search = (String) msg.readMsg(socket);
		ResultSet rs = null;
		if (!search.equals("")) {
			String cond1 = new String("������ like '%" + search + "%'");
			String cond2 = new String("����λ1 like '%" + search + "%'");
			String cond3 = new String("����λ2 like '%" + search + "%'");
			String cond4 = new String("����λ3 like '%" + search + "%'");
			String cond5 = new String("�豸1 like '%" + search + "%'");
			String cond6 = new String("�豸2 like '%" + search + "%'");
			String cond = new String(
					cond1 + " or " + cond2 + " or " + cond3 + " or " + cond4 + " or " + cond5 + " or " + cond6);
			rs = db.select("*", table, cond);
		} else {
			rs = db.select("*", table);
		}
		while (rs.next()) {
			signal = "next";
			msg.sendMsg(socket, signal);
			WarshipWeaponMsg ww = new WarshipWeaponMsg(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4),
					rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
					rs.getString(10));
			msg.sendMsg(socket, ww);
		}
		signal = "over";
		msg.sendMsg(socket, signal);
	}

	public void run() {
		try {
			while (true) {
				String status = (String) msg.readMsg(socket);
				switch (status) {
				case "login":
					System.out.println("��½��....");
					Login();
					break;
				case "searchwarship":
					System.out.println("������ѯ....");
					SearchWarship();
					break;
				case "searchweapon":
					System.out.println("װ����ѯ....");
					SearchWeapon();
					break;
				case "searchww":
					System.out.println("��װ��ѯ....");
					SearchWW();
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("�ͻ��˶Ͽ�����");
		}

		try {
			socket.close();
			System.out.println("�رշ������߳�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
