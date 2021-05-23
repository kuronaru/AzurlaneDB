package msg;

/**
 * ��Ϣ��װ�࣬ʹ�ö������������
 * @author ½�ҿ�
 * @date 2021��4��28��
 */

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Msg {
	public Object readMsg(Socket socket) throws IOException, ClassNotFoundException {
		socket.setTcpNoDelay(true);
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		return ois.readObject();
	}
	public void sendMsg(Socket socket, Object obj) throws IOException {
		socket.setTcpNoDelay(true);
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(obj);
		oos.flush();
	}
}
