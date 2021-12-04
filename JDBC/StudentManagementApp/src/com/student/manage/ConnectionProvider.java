package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con;

	public static Connection getConnection() {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// get connection
			String username = "root";
			String password = "Forcedile@123";
			String url = "jdbc:mysql://localhost:3306/student_manage";

			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
