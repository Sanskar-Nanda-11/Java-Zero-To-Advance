package com.besant.packages.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {

		// TODO Auto-generated method stub

		



		    static void databaseOperations() {
		        try {
		            System.out.println("Enter the operation you want to perform:");
		            System.out.println("1. Insert");
		            System.out.println("2. Update");
		            System.out.println("3. Delete");
		            System.out.println("4. Exit");

		            // Step 1: Create the driver
		            Class.forName("com.mysql.cj.jdbc.Driver");

		            // Step 2: Create a connection
		            Connection connection = DriverManager.getConnection(
		                    "jdbc:mysql://localhost:3306/jdbc", "root", "root");

		            Scanner sc = new Scanner(System.in);
		            int userInput = sc.nextInt();
		            sc.nextLine(); // Consume newline

		            PreparedStatement statement = null;

		            switch (userInput) {
		                case 1:
		                    // Insert statement
		                    System.out.println("Enter the name you want: ");
		                    String name = sc.nextLine();

		                    System.out.println("Enter the Id: ");
		                    String id = sc.nextLine();

		                    System.out.println("Enter the location: ");
		                    String location = sc.nextLine();

		                    System.out.println("Enter the phone number: ");
		                    int phoneNo = sc.nextInt();

		                    statement = connection.prepareStatement(
		                            "INSERT INTO user2 (name, email, location, phone) VALUES (?, ?, ?, ?)");
		                    statement.setString(1, name);
		                    statement.setString(2, id);
		                    statement.setString(3, location);
		                    statement.setInt(4, phoneNo);
		                    break;

		                case 2:
		                    // Update statement
		                    System.out.println("Enter the ID you want to update: ");
		                    int updateId = sc.nextInt();
		                    sc.nextLine(); // Consume newline

		                    System.out.println("Enter the updated name: ");
		                    name = sc.nextLine();

		                    statement = connection.prepareStatement(
		                            "UPDATE user2 SET name = ? WHERE id = ?");
		                    statement.setString(1, name);
		                    statement.setInt(2, updateId);
		                    break;

		                case 3:
		                    // Delete statement
		                    System.out.println("Enter the ID you want to delete: ");
		                    int deleteId = sc.nextInt();

		                    statement = connection.prepareStatement("DELETE FROM user2 WHERE id = ?");
		                    statement.setInt(1, deleteId);
		                    break;

		                case 4:
		                    // Exit
		                    System.out.println("Connection closed.");
		                    connection.close();
		                    return;

		                default:
		                    System.err.println("Invalid user input, enter number from 1 to 4! Try Again!");
		                    databaseOperations();
		                    return;
		            }

		            // Step 4: Execute the query
		            if (statement != null) {
		                int result = statement.executeUpdate();
		                if (result > 0) {
		                    System.out.println("Query operation successful.");
		                    databaseOperations(); // Recur for next operation
		                } else {
		                    System.err.println("Something went wrong.");
		                }
		            }

		        } catch (InputMismatchException e) {
		            System.err.println("Please enter a valid number from 1 to 4! Try again!");
		            databaseOperations();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

		    public static void main(String[] args) {
		        databaseOperations();
		    }
		}

	


