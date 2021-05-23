package application;

import java.net.Socket;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import msg.LoginMsg;
import msg.Msg;

public class Login {

	@FXML
	private TextField account;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private Button loginButton;
	
	@FXML
    private Button exitButton;
    
	@FXML
	void login(ActionEvent event) throws Exception {
		String IP = "127.0.0.1";
		int PORT = 8080;
		Msg msg = new Msg();
		Socket s = new Socket(IP, PORT);
		msg.sendMsg(s, "login");
		LoginMsg login = new LoginMsg(account.getText(), password.getText());
		msg.sendMsg(s, login);
		String reply = (String) msg.readMsg(s);
		System.out.println(reply);
		//加载查询界面
		if(reply.equals("登陆成功")) loadquery();
		else {
			password.setText(null);
			password.setPromptText("用户名或密码错误");
		}
		s.close();
		System.out.println("套接字关闭");
	}

    @FXML
    void exit(ActionEvent event) {
    	Stage stage = (Stage) exitButton.getScene().getWindow();
    	stage.close();
    }
	
	void loadquery() throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(loader.getClassLoader().getResource("fxml/Query.fxml"));
		Parent root = loader.load();
		Scene query = new Scene(root, 1280, 800);
		Stage stage = (Stage) loginButton.getScene().getWindow();
		stage.hide();
		stage.setScene(query);
		stage.show();
	}

	@FXML
	void initialize() {

	}
}
