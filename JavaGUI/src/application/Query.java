package application;

import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import msg.*;

public class Query implements Initializable {

    @FXML
    private TabPane tabpane;

    @FXML
    private TableView<WarshipInfoMsg> warshipInfoTable;

    @FXML
    private TableColumn<WarshipInfoMsg, String> name;

    @FXML
    private TableColumn<WarshipInfoMsg, String> alias;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> id;

    @FXML
    private TableColumn<WarshipInfoMsg, String> type;

    @FXML
    private TableColumn<WarshipInfoMsg, String> rarity;

    @FXML
    private TableColumn<WarshipInfoMsg, String> camp;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> durability;

    @FXML
    private TableColumn<WarshipInfoMsg, String> armor;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> reload;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> artillery;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> torpedo;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> motility;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> antiaircraft;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> aviation;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> consume;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> antisubmarine;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> luck;

    @FXML
    private TableColumn<WarshipInfoMsg, Integer> speed;

    @FXML
    private TextField warshipQueryCont;

    @FXML
    private Button warshipSearchBtn;

    @FXML
    private Button exitButton;

    @FXML
    private CheckBox allType;

    @FXML
    private CheckBox allCamp;

    @FXML
    private CheckBox allRarity;

    @FXML
    private CheckBox front;

    @FXML
    private CheckBox usa;

    @FXML
    private CheckBox normal;

    @FXML
    private CheckBox back;

    @FXML
    private CheckBox uk;

    @FXML
    private CheckBox rare;

    @FXML
    private CheckBox dd;

    @FXML
    private CheckBox jp;

    @FXML
    private CheckBox sr;

    @FXML
    private CheckBox cl;

    @FXML
    private CheckBox de;

    @FXML
    private CheckBox ssr;

    @FXML
    private CheckBox hl;

    @FXML
    private CheckBox cn;

    @FXML
    private CheckBox ur;

    @FXML
    private CheckBox bb;

    @FXML
    private CheckBox it;

    @FXML
    private CheckBox cva;

    @FXML
    private CheckBox ru;

    @FXML
    private CheckBox otherType;

    @FXML
    private CheckBox fr;

    @FXML
    private CheckBox wxfr;

    @FXML
    private CheckBox otherCamp;

    @FXML
    private TableView<WeaponInfoMsg> weaponTable;

    @FXML
    private TableColumn<WeaponInfoMsg, String> name1;

    @FXML
    private TableColumn<WeaponInfoMsg, String> type1;

    @FXML
    private TableColumn<WeaponInfoMsg, String> camp1;

    @FXML
    private TableColumn<WeaponInfoMsg, String> damage;

    @FXML
    private TableColumn<WeaponInfoMsg, String> firingrate;

    @FXML
    private TableColumn<WeaponInfoMsg, String> ammo;

    @FXML
    private TableColumn<WeaponInfoMsg, Integer> artillery1;

    @FXML
    private TableColumn<WeaponInfoMsg, Integer> torpedo1;

    @FXML
    private TableColumn<WeaponInfoMsg, Integer> antiaircraft1;

    @FXML
    private TableColumn<WeaponInfoMsg, Integer> aviation1;

    @FXML
    private TableColumn<WeaponInfoMsg, Integer> durability1;

    @FXML
    private TableColumn<WeaponInfoMsg, Integer> motility1;

    @FXML
    private TableColumn<WeaponInfoMsg, Integer> accuracy;

    @FXML
    private TableColumn<WeaponInfoMsg, Integer> reload1;

    @FXML
    private TableColumn<WeaponInfoMsg, Integer> speed1;

    @FXML
    private TextField weaponQueryCont;

    @FXML
    private Button weaponSearchBtn;

    @FXML
    private Button exitButton1;

    @FXML
    private CheckBox allType1;

    @FXML
    private CheckBox allCamp1;

    @FXML
    private CheckBox ckartillery;

    @FXML
    private CheckBox usa1;

    @FXML
    private CheckBox cktorpedo;

    @FXML
    private CheckBox uk1;

    @FXML
    private CheckBox ckantiaircraft;

    @FXML
    private CheckBox jp1;

    @FXML
    private CheckBox fighter;

    @FXML
    private CheckBox de1;

    @FXML
    private CheckBox bomber;

    @FXML
    private CheckBox cn1;

    @FXML
    private CheckBox torpedoplane;

    @FXML
    private CheckBox it1;

    @FXML
    private CheckBox equipment;

    @FXML
    private CheckBox ru1;

    @FXML
    private CheckBox otherType1;

    @FXML
    private CheckBox fr1;

    @FXML
    private CheckBox wxfr1;

    @FXML
    private CheckBox otherCamp1;

    @FXML
    private TableView<WarshipWeaponMsg> wwTable;

    @FXML
    private TableColumn<WarshipWeaponMsg, String> name2;

    @FXML
    private TableColumn<WarshipWeaponMsg, Integer> id2;

    @FXML
    private TableColumn<WarshipWeaponMsg, String> weapon1;

    @FXML
    private TableColumn<WarshipWeaponMsg, String> weapontype1;

    @FXML
    private TableColumn<WarshipWeaponMsg, String> weapon2;

    @FXML
    private TableColumn<WarshipWeaponMsg, String> weapontype2;

    @FXML
    private TableColumn<WarshipWeaponMsg, String> weapon3;

    @FXML
    private TableColumn<WarshipWeaponMsg, String> weapontype3;

    @FXML
    private TableColumn<WarshipWeaponMsg, String> equipment1;

    @FXML
    private TableColumn<WarshipWeaponMsg, String> equipment2;

    @FXML
    private TextField wwQueryCont;

    @FXML
    private Button wwSearchBtn;

    @FXML
    private Button exitButton2;

    @FXML
    void exit(ActionEvent event) {
    	Stage stage = (Stage) exitButton.getScene().getWindow();
    	stage.close();
    }

    @FXML
    void searchWarship(ActionEvent event) throws Exception {
    	String IP = "127.0.0.1";
		int PORT = 8080;
		Msg msg = new Msg();
		Socket s = new Socket(IP, PORT);
		msg.sendMsg(s, "searchwarship");
    	String str = warshipQueryCont.getText();
    	msg.sendMsg(s, str);
    	ObservableList<WarshipInfoMsg> data = FXCollections.observableArrayList();
    	String signal = (String) msg.readMsg(s);
    	while(!signal.equals("over")) {
    		WarshipInfoMsg info = (WarshipInfoMsg) msg.readMsg(s);
    		data.add(info);
    		signal = (String) msg.readMsg(s);
    	}
    	warshipInfoTable.setItems(data);
    }

    @FXML
    void searchWarshipWeapon(ActionEvent event) throws Exception {
    	String IP = "127.0.0.1";
		int PORT = 8080;
		Msg msg = new Msg();
		Socket s = new Socket(IP, PORT);
		msg.sendMsg(s, "searchww");
    	String str = wwQueryCont.getText();
    	msg.sendMsg(s, str);
    	ObservableList<WarshipWeaponMsg> data = FXCollections.observableArrayList();
    	String signal = (String) msg.readMsg(s);
    	while(!signal.equals("over")) {
    		WarshipWeaponMsg info = (WarshipWeaponMsg) msg.readMsg(s);
    		data.add(info);
    		signal = (String) msg.readMsg(s);
    	}
    	wwTable.setItems(data);
    }

    @FXML
    void searchWeapon(ActionEvent event) throws Exception {
    	String IP = "127.0.0.1";
		int PORT = 8080;
		int index=0;
		Msg msg = new Msg();
		Socket s = new Socket(IP, PORT);
		msg.sendMsg(s, "searchweapon");
    	String str = weaponQueryCont.getText();
    	msg.sendMsg(s, str);
    	ObservableList<WeaponInfoMsg> data = FXCollections.observableArrayList();
    	String signal = (String) msg.readMsg(s);
    	while(!signal.equals("over")) {
    		WeaponInfoMsg weapon = (WeaponInfoMsg) msg.readMsg(s);
    		data.add(weapon);
    		System.out.println(data.get(index++).getName());;
    		signal = (String) msg.readMsg(s);
    	}
    	weaponTable.setItems(data);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		allType.setSelected(true);
		allCamp.setSelected(true);
		allRarity.setSelected(true);
		allType1.setSelected(true);
		allCamp1.setSelected(true);
		
		name.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, String>("name"));
		alias.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, String>("alias"));
		id.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("id"));
		type.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, String>("type"));
		rarity.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, String>("rarity"));
		camp.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, String>("camp"));
		durability.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("durability"));
		armor.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, String>("armor"));
		reload.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("reload"));
		artillery.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("artillery"));
		torpedo.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("torpedo"));
		motility.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("motility"));
		antiaircraft.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("antiaircraft"));
		aviation.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("aviation"));
		consume.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("consume"));
		antisubmarine.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("antisubmarine"));
		luck.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("luck"));
		speed.setCellValueFactory(new PropertyValueFactory<WarshipInfoMsg, Integer>("speed"));
		
		name1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, String>("name"));
		type1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, String>("type"));
		camp1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, String>("camp"));
		damage.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, String>("damage"));
	    firingrate.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, String>("firingrate"));
	    ammo.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, String>("ammo"));
	    artillery1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, Integer>("artillery"));
	    torpedo1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, Integer>("torpedo"));
	    antiaircraft1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, Integer>("antiaircraft"));
	    aviation1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, Integer>("aviation"));
	    durability1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, Integer>("durability"));
	    motility1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, Integer>("motility"));
	    accuracy.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, Integer>("accuracy"));
	    reload1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, Integer>("reload"));
	    speed1.setCellValueFactory(new PropertyValueFactory<WeaponInfoMsg, Integer>("speed"));
	    
	    name2.setCellValueFactory(new PropertyValueFactory<WarshipWeaponMsg, String>("name"));
	    id2.setCellValueFactory(new PropertyValueFactory<WarshipWeaponMsg, Integer>("id"));
	    weapon1.setCellValueFactory(new PropertyValueFactory<WarshipWeaponMsg, String>("weapon1"));
	    weapontype1.setCellValueFactory(new PropertyValueFactory<WarshipWeaponMsg, String>("type1"));
	    weapon2.setCellValueFactory(new PropertyValueFactory<WarshipWeaponMsg, String>("weapon2"));
	    weapontype2.setCellValueFactory(new PropertyValueFactory<WarshipWeaponMsg, String>("type2"));
	    weapon3.setCellValueFactory(new PropertyValueFactory<WarshipWeaponMsg, String>("weapon3"));
	    weapontype3.setCellValueFactory(new PropertyValueFactory<WarshipWeaponMsg, String>("type3"));
	    equipment1.setCellValueFactory(new PropertyValueFactory<WarshipWeaponMsg, String>("equipment1"));
	    equipment2.setCellValueFactory(new PropertyValueFactory<WarshipWeaponMsg, String>("equipment2"));
	}
}
