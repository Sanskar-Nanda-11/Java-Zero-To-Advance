package com.besant.packages.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
	/* steps to establish database connection
	 		create a driver 
	 		create a connection -- authentication
	 		preparing  the queries
	 		Execute 
	 		Close the connection */
			
			try {
				System.out.println(" Enter The Operation You Want To Do");
				System.out.println(" 1 : Input "); // here the operation you want to choose 
				System.out.println(" 2 : Update ");
				System.out.println(" 3 : Delete ");
				System.out.println(" 4 : Exit ");
				// step1 :- creating the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				// step2 :- create a connection
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
				
				Scanner sc = new Scanner(System.in);
				System.out.println(" Enter Your Name ");
				int name = sc.nextInt();
				sc.nextLine();
				
				
				
				// step3 :- prepare the queries 
				PreparedStatement statement = connection.prepareStatement("insert into user (name) values (?);");
				statement.setString(1, name);
				
				// step4 :- Executing the queries
				int result = statement.executeUpdate();
				
				if(result > 0) {
					System.out.println(" Data inserted ");
				}else {
					System.out.println(" Something Wrong ");
				}
				
				// step5 :- closing the connection
				connection.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

