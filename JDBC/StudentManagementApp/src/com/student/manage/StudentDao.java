package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class StudentDao {

	public static boolean insertStudentToDB(Student student) {
		boolean flag = false;
		try {
			Connection con = ConnectionProvider.getConnection();
			String query = "insert into students(sname,sphone,scity) values(?,?,?)";

			// PreparedStatement - for dynamic query
			PreparedStatement pstmt = con.prepareStatement(query);

			// set the value of parameters
			pstmt.setString(1, student.getSname()); // 1 means we want to set value in first question mark
			pstmt.setString(2, student.getSphone()); // setting value in second question mark
			pstmt.setString(3, student.getScity()); // setting value in third question mark

			// execute query
			pstmt.executeUpdate(); // we dont expect anyting thats why using executeUpdate()
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean deleteStudent(int sid) {
		boolean flag = false;

		try {
			// get connection
			Connection con = ConnectionProvider.getConnection();
			String query = "delete from students where sid=?";

			// Prepared statement for dynamic queries
			PreparedStatement pstmt = con.prepareStatement(query);

			// setting parameters
			pstmt.setInt(1, sid);

			// exceuting query
			// when we dont expect any data from query use pstmt.executeUpdate();
			pstmt.executeUpdate();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public static void displayAll() {
		try {
			// get connection
			Connection con = ConnectionProvider.getConnection();
			String query = "select * from students";

			// Statement for static quries
			Statement stmt = con.createStatement();

			// executing query
			// whenever we want to get some data use executeQuery() method
			ResultSet result = stmt.executeQuery(query);

			// processing data
			System.out.println(result.getString(2));
			while (result.next()) {
				int sid = result.getInt(1); // column number according to our table in database
				String sname = result.getString(2);
				String sphone = result.getString(3);
				String scity = result.getString(4);

				System.out.println("Student id : " + sid);
				System.out.println("Student name : " + sname);
				System.out.println("Student phone : " + sphone);
				System.out.println("Student city : " + scity);
				System.out.println("++++++++++++++++++++++++++++++++");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
