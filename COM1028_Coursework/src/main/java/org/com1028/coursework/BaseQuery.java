package org.com1028.coursework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseQuery {
	protected Connection con;
	private final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private final String db = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=BST";

	public BaseQuery(String uname, String pwd) {
		try {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(db, uname, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Default constructor that uses a default root login
	public BaseQuery() {
		try {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(db, "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected ResultSet useTable(String tableName) throws SQLException {
		String query = "SELECT * FROM " + tableName;
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(query);
		return rs;
	}

	// Allows for a full SQL query to be passed into the method for
	// a corresponding ResultSet
	protected ResultSet performQuery(String query) throws SQLException {
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(query);
		return rs;
	}

}
