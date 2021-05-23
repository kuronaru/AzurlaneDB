package msg;

/**
 * 舰船信息封装类
 * @author 陆家俊
 * @date 2021年5月7日
 */

import java.io.Serializable;

@SuppressWarnings("serial")
public class WarshipInfoMsg implements Serializable {
	private String name;
	private String alias;
	private int id;
	private String type;
	private String rarity;
	private String camp;
	private int durability;
	private String armor;
	private int reload;
	private int artillery;
	private int torpedo;
	private int motility;
	private int antiaircraft;
	private int aviation;
	private int consume;
	private int antisubmarine;
	private int luck;
	private int speed;

	public WarshipInfoMsg(String name, String alias, int id, String type, String rarity, String camp, int durability,
			String armor, int reload, int artillery, int torpedo, int motility, int antiaircraft, int aviation,
			int consume, int antisubmarine, int luck, int speed) {
		this.name = name;
		this.alias = alias;
		this.id = id;
		this.type = type;
		this.rarity = rarity;
		this.camp = camp;
		this.durability = durability;
		this.armor = armor;
		this.reload = reload;
		this.artillery = artillery;
		this.torpedo = torpedo;
		this.motility = motility;
		this.antiaircraft = antiaircraft;
		this.aviation = aviation;
		this.consume = consume;
		this.antisubmarine = antisubmarine;
		this.luck = luck;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public String getAlias() {
		return alias;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getRarity() {
		return rarity;
	}

	public String getCamp() {
		return camp;
	}

	public int getDurability() {
		return durability;
	}

	public String getArmor() {
		return armor;
	}

	public int getReload() {
		return reload;
	}

	public int getArtillery() {
		return artillery;
	}

	public int getTorpedo() {
		return torpedo;
	}

	public int getMotility() {
		return motility;
	}

	public int getAntiaircraft() {
		return antiaircraft;
	}

	public int getAviation() {
		return aviation;
	}

	public int getConsume() {
		return consume;
	}

	public int getAntisubmarine() {
		return antisubmarine;
	}

	public int getLuck() {
		return luck;
	}

	public int getSpeed() {
		return speed;
	}
}
