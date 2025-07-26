package com.jdbc.crud_operations;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Blob {
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:mysql://localhost:3306/educate";
		String name = "root";
		String password = "Naren@123";
		
		String sql = "Update `student` set `dp`=? WHERE `roll` = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url,name,password);
			
			pstmt = con.prepareStatement(sql);
			Scanner scan = new Scanner(System.in);
			
			pstmt.setInt(2,scan.nextInt());
			
			FileInputStream fis = new FileInputStream("C:\\Users\\Narendra\\eclipse-workspace\\Adv-Java\\First\\Image\\Full.jpg");
			
			pstmt.setBinaryStream(1, fis);
			
			
			
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
