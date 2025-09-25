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
	@WebServlet("/Userinput")
	public class Userinput extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			try {
				//step 1 : Create the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//step 2 : Create a connection
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
				
				//step 3 : Preparing the queries
				PreparedStatement statement = connection.prepareStatement("insert into user2(name , locate , num) values (?,?,?)");
				statement.setString(1, req.getParameter("inputname"));
				statement.setString(2, req.getParameter("Address"));
				statement.setString(3, req.getParameter("Number"));
				
				//step 4 : Executing the queries
				int result = statement.executeUpdate();
				
				// to print the html output on page
				PrintWriter out = resp.getWriter();
				
				if(result > 0) {
//					System.out.println("Data Insertd Successfully");
//					System.out.println("Data inserted successfully");
					resp.sendRedirect("Firstone.jsp");
					
				}else {
//					System.err.println("Something went wrong");
					out.println("<h1> Something went wrong </h1>");
				}
				
				
				System.out.println(result + " rows updated ");
				//step 5 : closing the connection
				connection.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		}

