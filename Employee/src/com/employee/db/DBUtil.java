package com.employee.db;

import java.sql.*;

public class DBUtil {

	public static Connection createConnection() {
		Connection con = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amit", "root", "root");
		} catch (Exception e) {

			System.out.println(e);
		}

		return con;
	}
}
