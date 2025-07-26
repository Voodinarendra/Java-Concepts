package com.jdbc.crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PracticePrintfUsed {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="Naren@123";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Load the Driver");
			
			con = DriverManager.getConnection(url,username,password);
			//System.out.println("DataBase-Connection Establish ");
			
			stmt = con.createStatement();
			//System.out.println("Create the Statement");
			
			result = stmt.executeQuery("Select * from student1");
			//System.out.println("Create the ExecuteQuery");
			
			//System.out.println("Processing the Result");
			
			displayResult(result);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {

			close(con, stmt, result);
			
		}

	}

	private static void close(Connection con, Statement stmt, ResultSet result) {
		try {
			if(result!=null) {
				result.close();		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(stmt!=null) {
				stmt.close();					
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

	public static void displayResult(ResultSet result) throws SQLException {
		
		System.out.println("--------------------------------------------");
		while(result.next()) {
			System.out.printf("|%1d | %6s | %18s | %8d|\n", result.getInt("Id"),
					result.getString("Name"),
					result.getString("Email"),
					result.getInt("Mobile"));
		}
		System.out.println("--------------------------------------------");
	}
}
