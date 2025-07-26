package com.jdbc.crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExampleRead {
	public static void main(String[] args) {
		Connection con  = null;
		Statement stmt = null;
		ResultSet res = null;
		String url = "jdbc:mysql://localhost:3306/student";
		String name = "root";
		String password = "Naren@123";
		
		String my_sql = "Select * from student ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class is loaded");
			
			con = DriverManager.getConnection(url,name,password);
			System.out.println("Establishing the connection");
			
			stmt = con.createStatement();
			System.out.println("Statement is created");
			
			res = stmt.executeQuery(my_sql);
			
			while(res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2)+ " " + res.getString(3)+ " " + res.getLong(4));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
