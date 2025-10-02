package com.besant.packages.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateUserData extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
				
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("update userData set name = ?, email = ?, location = ?, phone = ? where id = ?");
			statement.setString(1, req.getParameter("updateName"));
			statement.setString(2, req.getParameter("updateEmail"));
			statement.setString(3, req.getParameter("updateLocation"));
			statement.setLong(4, Long.parseLong(req.getParameter("updatePhone")));
			statement.setInt(5, Integer.parseInt(req.getParameter("updateId")));
			
			
			//step 4 : Executing the queries
			int result = statement.executeUpdate();
			PrintWriter out = resp.getWriter();
			if(result > 0) {
				out.println("<a href='index.jsp'><button style='color:white;border:none;border-radius:5px;padding:15px;background-color: blue;'>Homepage</button></a><br/><h1>Record updated!</h1>");
			}else {
				System.err.println("Something went wrong");
				resp.getWriter().write("Failed to delete the user record.");
			}
			
			//step 5 : closing the connection
			connection.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
