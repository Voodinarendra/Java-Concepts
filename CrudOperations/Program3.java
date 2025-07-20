package com.crud.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		String url = "jdbc:mysql://localhost:3306/educate";
		String name = "root";
		String password = "Naren@123";
		
		String sql = "Update employee "
				+ "set name = ? "
						+ "where id = 1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load the Driver");
			
			con = DriverManager.getConnection(url,name,password);
			System.out.println("Establishing the Connection");
			
			pstmt = con.prepareStatement(sql);
			System.out.println("PreparedStatement is created");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter The Name: ");
			pstmt.setString(1,scan.next());
			
			int i = pstmt.executeUpdate();
			System.out.println(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
