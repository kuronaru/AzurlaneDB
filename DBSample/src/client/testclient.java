package client;

/**
 * �ͻ��˲�����
 * @author ½�ҿ�
 * @date 2021��5��7��
 */

import java.io.IOException;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBHelper;
import msg.*;

public class testclient {

	public static void main(String[] args) throws Exception {
		DBHelper db1 = new DBHelper();
		DBHelper db2 = new DBHelper();
		ResultSet rs1 = db1.select("*", "������Ϣ");
		while (rs1.next()) {
			ResultSet rs2 = db2.select("*", "��������","��� = "+rs1.getInt(3));
			System.out.print(rs1.getString(1));
			if(rs2.next())
			System.out.println(rs2.getInt(3));
			System.out.println("��������" + rs1.getString(1) + "\t������" + rs1.getString(2) + "\t��ţ�" + rs1.getString(3)
					+ "\t���ͣ�" + rs1.getString(4) + "\tϡ�жȣ�" + rs1.getString(5) + "\t��Ӫ��" + rs1.getString(6));
		}
		System.out.println("success");
	}

//	public static void main(String[] args) {
//		String IP = "127.0.0.1";
//		int PORT = 8080;
//		Msg msg = new Msg();
//
//		try {
//			Socket s = new Socket(IP, PORT);
//			System.out.println("�ͻ��˽�������");
//			msg.sendMsg(s, "login");
//			System.out.println("kuro������");
//			LoginMsg login = new LoginMsg("kuronaru", "114514");
//			msg.sendMsg(s, login);
//			System.out.println("kuro������");
//			String reply = (String) msg.readMsg(s);
//			System.out.println(reply);
//		} catch (IOException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		System.out.println("shutdown");
//	}

}
