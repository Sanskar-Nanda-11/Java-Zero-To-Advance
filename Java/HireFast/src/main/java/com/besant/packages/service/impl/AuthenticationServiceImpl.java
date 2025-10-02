package com.besant.packages.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.besant.packages.services.AuthenticationService;

public class AuthenticationServiceImpl implements AuthenticationService{

	@Override
	public void orgSignup(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("insert into org_auth (email,password,type) values (?,?,'org');");
			statement.setString(1, req.getParameter("email"));
			statement.setString(2, req.getParameter("password"));
			
			
			//step 4 : Executing the queries
			int result = statement.executeUpdate();
			
			if(result > 0) {
//				System.out.println("Row inserted successfully");
				resp.sendRedirect("orgLogin.html");
			}else {
				resp.sendRedirect("404.html");
			}
			
			//step 5 : closing the connection
			connection.close();
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void orgLogin(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("select * from org_auth where email = ? and password = ?; ");
			statement.setString(1, req.getParameter("email"));
			statement.setString(2, req.getParameter("password"));
			
			
			//step 4 : Executing the queries
			ResultSet set = statement.executeQuery();
			
			while(set.next()) {
				int orgId = set.getInt("orgId");
				HttpSession session = req.getSession();
	            session.setAttribute("orgId", orgId);
				resp.sendRedirect("orgDashboard.html");
			}
			
			//step 5 : closing the connection
			connection.close();
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void userSignup(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("insert into user_auth (email,password,type) values (?,?,'user');");
			statement.setString(1, req.getParameter("email"));
			statement.setString(2, req.getParameter("password"));
			
			
			//step 4 : Executing the queries
			int result = statement.executeUpdate();
			
			if(result > 0) {
//				System.out.println("Row inserted successfully");
				resp.sendRedirect("userLogin.html");
			}else {
				resp.sendRedirect("404.html");
			}
			
			//step 5 : closing the connection
			connection.close();
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void userLogin(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("select * from user_auth where email = ? and password = ?; ");
			statement.setString(1, req.getParameter("email"));
			statement.setString(2, req.getParameter("password"));
			
			
			//step 4 : Executing the queries
			ResultSet set = statement.executeQuery();
			
			while(set.next()) {
				int userId = set.getInt("userId");
				HttpSession session = req.getSession();
	            session.setAttribute("userId", userId);
	            session.setAttribute("email", set.getString("email"));
				resp.sendRedirect("userDashboard.jsp");
			}
			
			//step 5 : closing the connection
			connection.close();
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
