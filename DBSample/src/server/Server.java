package server;

/**
 * ��������
 * @author ½�ҿ�
 * @date 2021��4��28��
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
			System.out.println("����������....");
			// ���ܿͻ��˽��벢Ϊÿ���ͻ��˿����߳�
			while (true) {
				Socket s = ss.accept();
				s.getInetAddress();
				System.out.println("�ͻ��ˣ�" + InetAddress.getLocalHost() + "�����ӵ�������");
				ServerThread st = new ServerThread(s);
				st.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
