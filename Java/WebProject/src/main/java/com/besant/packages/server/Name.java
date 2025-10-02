package com.besant.packages.server;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/name")
public class Name extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("insert into user(name) values (?)");
			statement.setString(1, req.getParameter("inputName"));
			
			
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
