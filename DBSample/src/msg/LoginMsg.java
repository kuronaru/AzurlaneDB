package msg;

/**
 * 登录信息类
 * @author 陆家俊
 * @date 2021年4月28日
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
