package com.besant.packages.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.besant.packages.services.AddProfileService;

public class AddProfileServiceImpl implements AddProfileService{

	@Override
	public void addProfile(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("insert into user_profile (userId,name,email,phone,location,education,experience) values (?,?,?,?,?,?,?); ");
			HttpSession session = req.getSession();
			statement.setInt(1, (int) session.getAttribute("userId"));
			statement.setString(2, req.getParameter("name"));
			statement.setString(3, (String) session.getAttribute("email"));
			statement.setLong(4,Long.parseLong(req.getParameter("phone")));
			statement.setString(5, req.getParameter("location"));
			statement.setString(6, req.getParameter("education"));
			statement.setInt(7,Integer.parseInt(req.getParameter("experience")));
			
			
			//step 4 : Executing the queries
			int result = statement.executeUpdate();
			
			if(result > 0) {
//				System.out.println("Row inserted successfully");
				resp.sendRedirect("userDashboard.jsp");
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

}
