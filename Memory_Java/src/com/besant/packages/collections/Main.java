package com.besant.packages.collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//import java.sql.Connection;
//import java.sql.DriverManager;

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
			// step1 :- creating the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// step2 :- create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","adminnews");
			
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter Your Name ");
			String name = sc.nextLine();
			
			
			// step3 :- prepare the queries 
			PreparedStatement statement = connection.prepareStatement("insert into user (name) values ('name1');");
			
			
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
