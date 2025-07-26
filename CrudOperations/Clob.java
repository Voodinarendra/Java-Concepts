package com.jdbc.crud_operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Clob {
	public static void main(String[] args) {
		try {
			Connection con  = null;
			PreparedStatement pstmt = null;
			String url = "jdbc:mysql://localhost:3306/educate";
			String name = "root";
			String password = "Naren@123";
			String Query = "Update `student` set `intro`=? WHERE `roll`=?";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url,name,password);
			
			pstmt = con.prepareStatement(Query);
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the roll: ");
			pstmt.setInt(2, scan.nextInt());
			
			FileReader fr = new FileReader("C:\\Users\\Narendra\\eclipse-workspace\\Adv-Java\\First\\Intro.txt");
			pstmt.setCharacterStream(1, fr);
			
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException|FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
