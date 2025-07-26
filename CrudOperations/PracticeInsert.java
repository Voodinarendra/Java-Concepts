package com.jdbc.crud_operations;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PracticeInsert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt= null;
		try {
			String url = "jdbc:mysql://localhost:3306/student";
			String username = "root";
			String password = "Naren@123";
			String sql = "insert into `student1` values(?,?,?,?)";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			pstmt = con.prepareStatement(sql);
			// User Input
			String choice ;
			do {
				System.out.println("Enter the Id: ");
				int id = scan.nextInt();
				System.out.println("Enter the Name: ");
				String name = scan.next();
				System.out.println("Enter the Email: ");
				String email = scan.next();
				System.out.println("Enter the Mobile: ");
				long mobile = scan.nextLong();
				
				pstmt.setInt(1,id);
				pstmt.setString(2, name);
				pstmt.setString(3, email);
				pstmt.setLong(4, mobile);
				
				int i = pstmt.executeUpdate();
				System.out.println(i);
				
				System.out.println("You want to continue(yes/no): ");
				choice = scan.next();
				
			}while(choice.equalsIgnoreCase("yes"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			close(con, pstmt);
		}
	}

	private static void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
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
