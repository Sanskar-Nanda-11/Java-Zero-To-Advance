package com.besant.packages.server;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteUserData extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
				
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("delete from userData where id = ?");
			statement.setInt(1, Integer.parseInt(req.getParameter("getId")));
			
			
			//step 4 : Executing the queries
			int result = statement.executeUpdate();
			if(result > 0) {
				System.out.println("Query operation successfull");
				resp.sendRedirect("index.jsp");
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
