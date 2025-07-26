package com.jdbc.crud_operations;

	import java.sql.Connection;


	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Insert {
		public static void main(String[] args) {
			Connection connection = null;
			Statement statement = null;
			ResultSet result = null;
			
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username="root";
			String password="Naren@123";
			String sql = "insert into `jdbc`(`id`,`name`,`email`,`dept`,`salary`) values(7,'Lalli','lalli@gmail.com','HR',65000)";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Load the Driver");
				
				 connection = DriverManager.getConnection(url,username,password);
				System.out.println("Establishing the DataBase-Connection");
				
				 statement = connection.createStatement();
				System.out.println("Create the Statement ");
				
				int i = statement.executeUpdate(sql);
				System.out.println(i);
				//System.out.println("Create the ResultSet");
				
				//System.out.println("Process the Result");
				//displayEmployeeDetails(result);
			}
			catch(Exception e)  {
				e.printStackTrace();
			}
			
			finally {
				
				close(connection, statement, result);
				
			}
		}

//		public static void displayEmployeeDetails(ResultSet result) throws SQLException {
//			while(result.next()) {
//				System.out.println(result.getInt("Id")+" , "+result.getString("Name")+" , "+result.getString("email")+" , "+
//			result.getString("dept")+" , "+result.getInt("Salary"));
//			}
//		}

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
				if(statement!=null) {		
					statement.close();
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
