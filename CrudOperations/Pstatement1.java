package com.jdbc.crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Pstatement1 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Connection connection = null;
			PreparedStatement preparedstatement = null;
			ResultSet result =null;
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String name = "root";
			String password = "Naren@123";
			String sql = "Select * from `jdbcex` " +
						 "where dept = ?";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url,name,password);
				preparedstatement =connection.prepareStatement(sql);
				System.out.println("Enter the Department: ");
				preparedstatement.setString(1, scan.next());
				result =  preparedstatement.executeQuery();
				
				displayResult(result);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				close(connection, preparedstatement, result);
			}
		}

		public static void displayResult(ResultSet result) throws SQLException {
			while(result.next()) {
				System.out.println(result.getInt("Id")+" , "+result.getString("Name")+" , "+
						result.getString("Email")+" , "+result.getString("Dept")+" , "+ result.getInt("Salary"));
			}
		}

		private static void close(Connection connection, PreparedStatement preparestatemt, ResultSet result) {
			try {
				if(result!=null) {
					result.close();				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(preparestatemt!=null) {
					preparestatemt.close();					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(connection!=null) {
					connection.close();				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}