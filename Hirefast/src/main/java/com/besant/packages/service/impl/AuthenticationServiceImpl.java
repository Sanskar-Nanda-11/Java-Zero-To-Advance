package com.besant.packages.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.packages.services.AuthenticationServices;

public class AuthenticationServiceImpl implements AuthenticationServices{

	@Override
	public void orgSignUp(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("insert into org_auth(email,password, type) values (?,?,'org')");
			statement.setString(1, req.getParameter("email"));
			statement.setString(2, req.getParameter("password"));
			
			
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
	

	@Override
	public void orgLogin(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("select * from org_auth where email = ? and password = ?");
			statement.setString(1, req.getParameter("email"));
			statement.setString(2, req.getParameter("password"));
			
			
			//step 4 : Executing the queries
//			int result = statement.executeUpdate();
			ResultSet set = statement.executeQuery();
			
			while(set.next()) {
				resp.sendRedirect("/Hirefast/OrgDashboard.html");
			}
			
			//step 5 : closing the connection
			connection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void userSignUp(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		System.out.println(" I ");
	}

	@Override
	public void userLogin(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		System.out.println(" Sleep ");
	}

}
