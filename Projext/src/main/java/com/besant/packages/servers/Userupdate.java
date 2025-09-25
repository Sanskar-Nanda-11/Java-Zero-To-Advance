package com.besant.packages.servers;

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
public class Userupdate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				try {
					//step 1 : Create the driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//step 2 : Create a connection
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
					
					//step 3 : Preparing the queries
					PreparedStatement statement = connection.prepareStatement("UPDATE user2 SET name = ?, locate = ?, num = ? WHERE id = ?");
					statement.setString(1, req.getParameter("Name"));
					statement.setString(2, req.getParameter("Location"));
					statement.setString(3 ,req.getParameter("Phone"));
					statement.setInt(4, Integer.parseInt(req.getParameter("Id")));
					
//					PreparedStatement statementt = connection.prepareStatement("UPDATE user2 SET name = ? WHERE id = ?");
//					statementt.setInt(1, Integer.parseInt(req.getParameter("deleteid")));
					
//					 statementt.setString(1, name);
//		             statementt.setInt(2, Integer.parseInt(req.getParameter("deleteid")));
		             
					//step 4 : Executing the queries
					int result = statement.executeUpdate();
					
					// to print the html output on page
					PrintWriter out = resp.getWriter();

					
					if(result > 0) {
					System.out.println(" Query Operation Successfully ");
					resp.sendRedirect("Firstone.jsp");
						
					}else {
						System.err.println("Something went wrong");
						resp.getWriter().write(" Something Went Wrong ");
					}///
					
					
					System.out.println(result + " rows updated ");
					//step 5 : closing the connection
					connection.close();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
	}
	}
