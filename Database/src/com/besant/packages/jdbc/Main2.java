package com.besant.packages.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		
		/* steps to establish database connection
		 		create a driver 
		 		create a connection -- authentication
		 		preparing  the queries
		 		Execute 
		 		Close the connection */
		operations();
	}
	
				
				static void operations() {
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
						// in the above line the database connection creates 
						
						Scanner sc = new Scanner(System.in); 		// here we create a object names " sc " for input 
//						System.out.println(" Enter Your Name ");
						int input = sc.nextInt();
						sc.nextLine();
						PreparedStatement statement = null;
						
						switch(input) {
						case 1:
							System.out.println("Enter Your Name ?");
							String name = sc.nextLine();
							System.out.println(" Enter Your Location ");
							String Locate = sc.nextLine();
							System.out.println(" Enter Your Number ?");
							int num = sc.nextInt();
							statement = connection.prepareStatement(" insert into user2 ( name , num , Locate ) values (?,?,?)");
							statement.setString(1, name);
							statement.setInt(2, num);
							statement.setString(3, Locate);
							break;
							
							
						case 2:
							System.out.println(" Enter The Id ( Updation ) ");
							int id = sc.nextInt();
							sc.nextLine();
							System.out.println(" Enter Your Name You Want To Update ");
							name = sc.nextLine();
							statement = connection.prepareStatement(" update user2 set name = ? where id = ? ");
							statement.setString(1, name);
							statement.setInt(2, id);
							break;
							
						case 3:
							System.out.println(" Enter The id of the data you want to delete :- ");
							id = sc.nextInt();
							statement = connection.prepareStatement(" delete from user2 where id = ? ");
							statement.setInt(1, id);
							break;
						case 4:
							System.out.println(" Connection Closed ");
							connection.close();
							break;
							
						default :
								System.err.println(" Invilid Plese try again ");
						}
					
				
					
					
					// step3 :- prepare the queries 
//					PreparedStatement statement = connection.prepareStatement("insert into user (name) values (?);");
//					statement.setString(1, name);
					
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