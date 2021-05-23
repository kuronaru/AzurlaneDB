package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(loader.getClassLoader().getResource("fxml/Login.fxml"));
		Parent root = loader.load();
		Scene login = new Scene(root, 360, 400);
		primaryStage.setTitle("舰娘管理系统");
		primaryStage.setScene(login);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
