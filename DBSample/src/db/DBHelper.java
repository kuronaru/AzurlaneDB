package db;

/**
 * ���ݿ������װ��
 * @author ½�ҿ�
 * @date 2021��4��28��
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {
	private static final String url = "jdbc:mysql://127.0.0.1/�������߽�������";
	private static final String name = "com.mysql.cj.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "Lujj474663";

	public Connection conn = null;
	public PreparedStatement pst = null;

	public DBHelper() {
		try {
			Class.forName(name);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(String table, String value) {
		try {
			String sql = "insert into " + table + " values (" + value + ")";
			pst = conn.prepareStatement(sql);
			pst.executeUpdate();
			System.out.println("execute: " + sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(String table, String col, String value) {
		try {
			String sql = "insert into " + table + "(" + col + ") values(" + value + ")";
			pst = conn.prepareStatement(sql);
			pst.executeUpdate();
			System.out.println("execute: " + sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(String table, String expr) {
		try {
			String sql = "update " + table + " set " + expr;
			pst = conn.prepareStatement(sql);
			pst.executeUpdate();
			System.out.println("execute: " + sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(String table, String expr, String cond) {
		try {
			String sql = "update " + table + " set " + expr + " where " + cond;
			pst = conn.prepareStatement(sql);
			pst.executeUpdate();
			System.out.println("execute: " + sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(String table) {
		try {
			String sql = "delete from " + table;
			pst = conn.prepareStatement(sql);
			pst.executeUpdate();
			System.out.println("execute: " + sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(String table, String cond) {
		try {
			String sql = "delete from " + table + " where " + cond;
			pst = conn.prepareStatement(sql);
			pst.executeUpdate();
			System.out.println("execute: " + sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet select(String attribute, String table) {
		try {
			String sql = "select " + attribute + " from " + table;
			pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			System.out.println("execute: " + sql);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultSet select(String attribute, String table, String cond) {
		try {
			String sql = "select " + attribute + " from " + table + " where " + cond;
			pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			System.out.println("execute: " + sql);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close() {
		try {
			this.conn.close();
			this.pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
