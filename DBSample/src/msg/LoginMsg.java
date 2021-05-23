package msg;

/**
 * ��¼��Ϣ��
 * @author ½�ҿ�
 * @date 2021��4��28��
 */

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginMsg implements Serializable {
	private String account;
	private String password;

	public LoginMsg(String account, String password) {
		this.account = account;
		this.password = password;
	}

	public String getAccount() {
		return account;
	}

	public String getPassword() {
		return password;
	}
}
