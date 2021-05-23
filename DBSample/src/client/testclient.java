package client;

/**
 * 客户端测试类
 * @author 陆家俊
 * @date 2021年5月7日
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
		ResultSet rs1 = db1.select("*", "舰船信息");
		while (rs1.next()) {
			ResultSet rs2 = db2.select("*", "舰船性能","编号 = "+rs1.getInt(3));
			System.out.print(rs1.getString(1));
			if(rs2.next())
			System.out.println(rs2.getInt(3));
			System.out.println("舰船名：" + rs1.getString(1) + "\t别名：" + rs1.getString(2) + "\t编号：" + rs1.getString(3)
					+ "\t类型：" + rs1.getString(4) + "\t稀有度：" + rs1.getString(5) + "\t阵营：" + rs1.getString(6));
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
//			System.out.println("客户端建立连接");
//			msg.sendMsg(s, "login");
//			System.out.println("kuro连接中");
//			LoginMsg login = new LoginMsg("kuronaru", "114514");
//			msg.sendMsg(s, login);
//			System.out.println("kuro已连接");
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
