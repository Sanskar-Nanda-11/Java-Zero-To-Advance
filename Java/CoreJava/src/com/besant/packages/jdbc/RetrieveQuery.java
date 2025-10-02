package com.besant.packages.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetrieveQuery {

	public static void main(String[] args) {
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
				
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("select * from userData");
			
			
			//step 4 : Executing the queries
			ResultSet set = statement.executeQuery();
			while(set.next()) {
				System.out.print(" " + set.getString("name"));
				System.out.print(" " + set.getString("email"));
				System.out.print(" " + set.getString("location"));
				System.out.print(" " + set.getInt("phone"));
				System.out.println("");
			}
			
			//step 5 : closing the connection
			connection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
