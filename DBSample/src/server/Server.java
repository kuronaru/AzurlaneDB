package server;

/**
 * 服务器类
 * @author 陆家俊
 * @date 2021年4月28日
 */

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket ss = new ServerSocket(8080);
			System.out.println("启动服务器....");
			// 接受客户端接入并为每个客户端开辟线程
			while (true) {
				Socket s = ss.accept();
				s.getInetAddress();
				System.out.println("客户端：" + InetAddress.getLocalHost() + "已连接到服务器");
				ServerThread st = new ServerThread(s);
				st.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
