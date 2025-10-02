package com.besant.packages.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Steps to establish database connection
		/*
		-1.create a driver
		-2.create a connection -- authentication
		-3.preparing the queries
		-4.Execute 
		-5.close the connection
		*/
		
	try {
		//step 1 : Create the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2 : Create a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name you want : ");
		String name = sc.nextLine();
		//step 3 : Preparing the queries
		PreparedStatement statement = connection.prepareStatement("insert into user(name) values (?)");
		statement.setString(1, name);
		
		
		//step 4 : Executing the queries
		int result = statement.executeUpdate();
		
		if(result > 0) {
			System.out.println("Data inserted successfully");
		}else {
			System.err.println("Something went wrong");
		}
		
		//step 5 : closing the connection
		connection.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
