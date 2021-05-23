package msg;

/**
 * 舰船搭载装备情况封装类
 * @author 陆家俊
 * @date 2021年5月7日
 */

import java.io.Serializable;

@SuppressWarnings("serial")
public class WarshipWeaponMsg implements Serializable {
	private String name;
	private int id;
	private String weapon1;
	private String type1;
	private String weapon2;
	private String type2;
	private String weapon3;
	private String type3;
	private String equipment1;
	private String equipment2;

	public WarshipWeaponMsg(String name, int id, String weapon1, String type1, String weapon2, String type2,
			String weapon3, String type3, String equipment1, String equipment2) {
		this.name = name;
		this.id = id;
		this.weapon1 = weapon1;
		this.type1 = type1;
		this.weapon2 = weapon2;
		this.type2 = type2;
		this.weapon3 = weapon3;
		this.type3 = type3;
		this.equipment1 = equipment1;
		this.equipment2 = equipment2;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getWeapon1() {
		return weapon1;
	}

	public String getType1() {
		return type1;
	}

	public String getWeapon2() {
		return weapon2;
	}

	public String getType2() {
		return type2;
	}

	public String getWeapon3() {
		return weapon3;
	}

	public String getType3() {
		return type3;
	}

	public String getEquipment1() {
		return equipment1;
	}

	public String getEquipment2() {
		return equipment2;
	}
}
