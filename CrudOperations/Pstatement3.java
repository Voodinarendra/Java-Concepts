package com.jdbc.crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Pstatement3 {
	public static void main(String[] args) {
		Connection con = null;
		
		PreparedStatement pstmt = null;

		Scanner scan = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String name = "root";
		String password = "Naren@123";
		String sql = "Insert into jdbcex(id,name,email,dept,salary) values(?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,name,password);
			//Pstatement1.displayResult(con);
			pstmt = con.prepareStatement(sql);
			System.out.println("Enter the Id: ");
			pstmt.setInt(1,scan.nextInt());
			System.out.println("Enter the Name: ");
			pstmt.setString(2,scan.next());
			System.out.println("Enter the Email: ");
			pstmt.setString(3,scan.next());
			System.out.println("Enter the Dept: ");
			pstmt.setString(4,scan.next());
			System.out.println("Enter the Salary: ");
			pstmt.setInt(5,scan.nextInt());
			
			int i= pstmt.executeUpdate();
			System.out.println(i);
			

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
			if(pstmt!=null) {
				pstmt.close();					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(con!=null) {
				con.close();					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
