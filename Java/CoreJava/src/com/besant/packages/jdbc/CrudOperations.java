package com.besant.packages.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CrudOperations {
	public static void main(String[] args) {
		databaseOperations();	
	}

	static void databaseOperations() {
		try {
			System.out.println("Enter the operation you want to perform :");
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Select");
			System.out.println("5.Exit");
			
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			Scanner sc = new Scanner(System.in);
			int userInput = sc.nextInt();
			sc.nextLine();
			PreparedStatement statement = null;
			
			switch(userInput) {
			case 1:
				//insert statement - insert into userData table
				System.out.println("Enter the name you want : ");
				String name = sc.nextLine();
				System.out.println("Enter the email : ");
				String email = sc.nextLine();
				System.out.println("Enter the location : ");
				String location = sc.nextLine();
				System.out.println("Enter the phone number : ");
				long phoneNo = sc.nextLong();
				statement = connection.prepareStatement("insert into userData (name,email,location,phone) values (?,?,?,?)");
				statement.setString(1, name);
				statement.setString(2, email);
				statement.setString(3, location);
				statement.setLong(4, phoneNo);
				break;
				
			case 2:
				//Update statement - Update name of selected id
				System.out.println("Enter the ID you want to update : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the updated name : ");
				name = sc.nextLine();
				statement = connection.prepareStatement("update userData set name=? where id = ?");
				statement.setString(1,name);
				statement.setInt(2,id);
				break;
				
			case 3:
				//Delete Statement - delete record of selected id
				System.out.println("Enter the ID you want to Delete : ");
				id = sc.nextInt();
				statement = connection.prepareStatement("delete from userData where id = ?");
				statement.setInt(1,id);
				break;
				
			case 4:
				//Select Statement - to get the user data from the table
				System.out.println("userData table data : ");
				System.out.println("");
				PreparedStatement RetrieveStatement = connection.prepareStatement("select * from userData");
				ResultSet set = RetrieveStatement.executeQuery();
				while(set.next()) {
					System.out.print(set.getString("name") + " , ");
					System.out.print(set.getString("email") + " , ");
					System.out.print(set.getString("location") + " , ");
					System.out.print(set.getLong("phone"));
					System.out.println("");
				}
				System.out.println("");
				databaseOperations();
				break;
				
			case 5:
				//Exit and close connection
				//step 5 : closing the connection
				System.out.println("Connection closed");
				connection.close();
				break;
				
			default:
				System.err.println("Invalid user input, Enter number from 1 - 5! Try Again!");
				databaseOperations();
				break;	
			}
		
				
			//step 4 : Executing the queries
			if(statement != null) {
				
				int result = statement.executeUpdate();

				if(result > 0) {
					System.out.println("Query operation successfull");
					databaseOperations();
				}else {
					System.err.println("Something went wrong");
				}

			}
					
			
		}
		catch(InputMismatchException e) {
			System.err.println("Please enter a number from 1 - 5! Try again!");
			databaseOperations();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
