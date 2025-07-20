package com.crud.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		String url = "jdbc:mysql://localhost:3306/educate";
		String name = "root";
		String password = "Naren@123";
		
		String sql = "Insert into employee(`id`,`name`,`dept`,`mobile`) values(?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Load the Driver");
			
			con = DriverManager.getConnection(url,name,password);
			//System.out.println("Establising the Connection");
			
			pstmt = con.prepareStatement(sql);
			System.out.println("Enter the id: ");
			pstmt.setInt(1,scan.nextInt());
			System.out.println("Enter the name : ");
			pstmt.setString(2, scan.next());
			System.out.println("Enter the dept: ");
			pstmt.setString(3, scan.next());
			System.out.println("Enter the mobile: ");
			pstmt.setLong(4, scan.nextLong());
			int i = pstmt.executeUpdate();
			System.out.println(i);
			
		
			
//			stmt = con.createStatement();
//			System.out.println("Create the Statement");
//			
//			res = stmt.executeQuery(sql);
//			System.out.println("Execute the Query");
//			
//			while(res.next()) {
//				System.out.println(res.getInt(1) + " " +res.getString(2)+" " + res.getString(3)+ " " + res.getString(4));
//			}
//			
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
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
}
