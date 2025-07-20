package com.crud.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {
	public static void main(String[] args)  {
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		String url = "jdbc:mysql://localhost:3306/educate";
		String name = "root";
		String password = "Naren@123";
		
		String sql = "Select * from student";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load the Driver");
			
			con = DriverManager.getConnection(url,name,password);
			System.out.println("Establising the Connection");
			
			stmt = con.createStatement();
			System.out.println("Create the Statement");
			
			res = stmt.executeQuery(sql);
			System.out.println("Execute the Query");
			
			while(res.next()) {
				System.out.println(res.getInt(1) + " " +res.getString(2)+" " + res.getString(3)+ " " + res.getString(4));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
