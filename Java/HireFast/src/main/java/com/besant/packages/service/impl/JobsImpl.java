package com.besant.packages.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.besant.packages.services.JobsService;

public class JobsImpl implements JobsService {

	@Override
	public void postJob(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hirefast","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("insert into all_jobs (title,job_description,role,salary,vacancy,orgName,orgId) values(?,?,?,?,?,?,?);");
			statement.setString(1, req.getParameter("title"));
			statement.setString(2, req.getParameter("jd"));
			statement.setString(3, req.getParameter("role"));
			statement.setInt(4,Integer.parseInt(req.getParameter("salary")));
			statement.setInt(5,Integer.parseInt(req.getParameter("vacancy")));
			statement.setString(6, req.getParameter("orgName"));
			HttpSession session = req.getSession(true);
			statement.setInt(7,(int) session.getAttribute("orgId"));
			
			//step 4 : Executing the queries
			int result = statement.executeUpdate();
			
			if(result > 0) {
//				System.out.println("Row inserted successfully");
				resp.sendRedirect("orgDashboard.html");
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
