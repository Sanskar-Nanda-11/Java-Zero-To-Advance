package com.besant.packages.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.packages.services.ApplyJobService;

public class ApplyJobServiceImpl implements ApplyJobService{

	@Override
	public void postApplication(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("insert into applications (name, email, phone, location, education, message, experience, userId, jobId) values(?,?,?,?,?,?,?,?,?);");
			statement.setString(1, req.getParameter("name"));
			statement.setString(2, req.getParameter("email"));
			statement.setLong(3,Long.parseLong(req.getParameter("phone")));
			statement.setString(4, req.getParameter("location"));
			statement.setString(5, req.getParameter("education"));
			statement.setString(6, req.getParameter("message"));
			statement.setInt(7,Integer.parseInt(req.getParameter("experience")));
			statement.setInt(8,Integer.parseInt(req.getParameter("userId")));
			statement.setInt(9,Integer.parseInt(req.getParameter("jobId")));
			
			//step 4 : Executing the queries
			int result = statement.executeUpdate();
			
			if(result > 0) {
//				System.out.println("Row inserted successfully");
				resp.sendRedirect("userDashboard.jsp");
			}else {
				resp.sendRedirect("404.html");
			}
			connection.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
