package com.crud.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt;
		String url = "jdbc:mysql://localhost:3306/educate";
		String name = "root";
		String password = "Naren@123";
		String sql = "insert into Food(`id`,`item`,`cost`) values(?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load the Driver");
			
			con = DriverManager.getConnection(url,name,password);
			System.out.println("Establishing the connection");
			
			pstmt = con.prepareStatement(sql);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Number of Values: ");
			int n = scan.nextInt();
			for(int i =0;i<n;i++) {
				System.out.println("Enter the Id: ");
				pstmt.setInt(1, scan.nextInt());
				System.out.println("Enter the Item: ");
				pstmt.setString(2, scan.next());
				System.out.println("Enter the Cost: ");
				pstmt.setInt(3, scan.nextInt());
				int j = pstmt.executeUpdate();
				System.out.println(j);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
