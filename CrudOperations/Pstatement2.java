package com.jdbc.crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Pstatement2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt =null;
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String name = "root";
		String password = "Naren@123";
		String sql = "Update `jdbcex` " +
				"Set Salary = Salary + ? " +
				"where dept = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,name,password);
			// Pstatement1.displayResult(con);
			 pstmt =  con.prepareStatement(sql);
			System.out.println("Enter the Salary: ");
			pstmt.setInt(1,scan.nextInt());
			System.out.println("Enter the Department: ");
			pstmt.setString(2,scan.next());
			int i = pstmt.executeUpdate();
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
