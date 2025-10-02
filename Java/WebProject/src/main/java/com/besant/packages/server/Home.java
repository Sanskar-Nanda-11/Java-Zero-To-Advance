package com.besant.packages.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Home is working");
		//By default the values passed from frontend is of String, we user Integer.parseInt to conver them to numbers
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		System.out.println("Your sum is : " + (num1 + num2));
		
		try {
			PrintWriter writer;
			
			writer = resp.getWriter();
			writer.print("your sum is " + (num1 + num2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
