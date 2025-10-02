package com.besant.packages.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/about")
public class About extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp){
		System.out.println("About is working");
	}
}
