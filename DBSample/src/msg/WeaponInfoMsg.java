package msg;

/**
 * 装备属性封装类
 * @author 陆家俊
 * @date 2021年5月7日
 */

import java.io.Serializable;

@SuppressWarnings("serial")
public class WeaponInfoMsg implements Serializable {
	private String name;
	private String type;
	private String camp;
	private String damage;
	private String firingrate;
	private String ammo;
	private int artillery;
	private int torpedo;
	private int antiaircraft;
	private int aviation;
	private int durability;
	private int motility;
	private int accuracy;
	private int reload;
	private int speed;

	public WeaponInfoMsg(String name, String type, String camp, String damage, String firingrate, String ammo,
			int artillery, int torpedo, int antiaircraft, int aviation, int durability, int motility, int accuracy,
			int reload, int speed) {
		this.name = name;
		this.type = type;
		this.camp = camp;
		this.damage = damage;
		this.firingrate = firingrate;
		this.ammo = ammo;
		this.artillery = artillery;
		this.torpedo = torpedo;
		this.antiaircraft = antiaircraft;
		this.aviation = aviation;
		this.durability = durability;
		this.motility = motility;
		this.accuracy = accuracy;
		this.reload = reload;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getCamp() {
		return camp;
	}

	public String getDamage() {
		return damage;
	}

	public String getFiringrate() {
		return firingrate;
	}

	public String getAmmo() {
		return ammo;
	}

	public int getArtillery() {
		return artillery;
	}

	public int getTorpedo() {
		return torpedo;
	}

	public int getAntiaircraft() {
		return antiaircraft;
	}

	public int getAviation() {
		return aviation;
	}

	public int getDurability() {
		return durability;
	}

	public int getMotility() {
		return motility;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public int getReload() {
		return reload;
	}

	public int getSpeed() {
		return speed;
	}
}
