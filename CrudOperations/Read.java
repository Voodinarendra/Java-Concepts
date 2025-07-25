package com.jdbc.crud_operations;

import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
	public static void main(String[] args) {
		 Connection connection = null;
		 Statement statement = null;
		 ResultSet result = null;
		 
		String url = "jdbc:mysql://localhost:3306/jan";
		String username = "root";
		String password = "Naren@123";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Loaded");
			
		    connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established");
			
			statement = connection.createStatement();
			System.out.println("Statement is Created Successfully");
			
			result = statement.executeQuery("Select * from month");
			System.out.println("ResultSet is Occurs Successfully");
			
			displaydata(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close(connection, statement, result);
			
		}
	}

	public static void displaydata(ResultSet result) throws SQLException {
		while(result.next()) {
			System.out.println(result.getInt("Id") + " , " + result.getString("Name") + " , " + result.getInt("Span"));
		}
	}

	private static void close(Connection connection, Statement statement, ResultSet result) {
		try {
			if(result!=null) {	
				result.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(result!=null) {	
				statement.close();					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(result!=null) {	
				connection.close();					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
