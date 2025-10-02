package com.besant.packages.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));
		String operation = req.getParameter("operation");
		
		switch(operation) {
		case("add"):
			int sum = number1 + number2; 
			System.out.println("Sum is : " + sum);
			resp.getWriter().print("Sum is : " + sum);
			break;
		case("subtract"):
			System.out.println("Difference is : " + (number1-number2));
			resp.getWriter().print("Difference is : " + (number1-number2));
			break;
		case("multiply"):
			System.out.println("Product is : " + number1*number2);
			resp.getWriter().print("Product is : " + number1*number2);
			break;
		case("divide"):
			System.out.println("Quotient is : " + number1/number2);
			resp.getWriter().print("Quotient is : " + number1/number2);
			break;
		default:
			System.out.println("Invalid input");
			resp.getWriter().print("Invalid input");
			break;
		}

	}
	
}
