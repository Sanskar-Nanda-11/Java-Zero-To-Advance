package com.besant.packages.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userData")
public class UserData extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//step 1 : Create the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 : Create a connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//step 3 : Preparing the queries
			PreparedStatement statement = connection.prepareStatement("insert into userData (name,email,location,phone) values (?,?,?,?)");
			statement.setString(1, req.getParameter("inputName"));
			statement.setString(2, req.getParameter("inputEmail"));
			statement.setString(3, req.getParameter("inputLocation"));
			statement.setLong(4, Long.parseLong(req.getParameter("inputPhone")));
			
			
			//step 4 : Executing the queries
			int result = statement.executeUpdate();
			
			//to print the html output
			PrintWriter out = resp.getWriter();
			
			if(result > 0) {
				System.out.println("Row inserted successfully");
				resp.sendRedirect("index.jsp");
			}else {
				out.println("<h1>Something went wrong</h1>");
			}
			
			//step 5 : closing the connection
			connection.close();
			
		}catch(SQLIntegrityConstraintViolationException e) {
			PrintWriter out = resp.getWriter();
			out.println("<h1>Duplicate email entry</h1>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
