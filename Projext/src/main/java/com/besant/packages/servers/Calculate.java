package com.besant.packages.servers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculate")
public class Calculate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(req.getParameter("num1"));
//		System.out.println(num);
//		System.out.println(" Post Works ");
//		resp.getWriter().print(" Form Submitted ");  // this is a line that will print after the input value gets submitted
//		resp.getWriter().print(num); // this line will print the value which is parsed 
		
		
		int nameinguser = Integer.parseInt(req.getParameter("num2"));
//		System.out.println(nameinguser);
//		resp.getWriter().print("form"); 
//		resp.getWriter().print(nameinguser);
		
//	int result = nameinguser + num;
//	System.out.println(result);
//	resp.getWriter().print(result);
		
		String ans = req.getParameter("ans");
//		String add = req.getParameter("add");
//		String subtract = req.getParameter("subtract");
//		String multiply = req.getParameter("multiply");
//		String divide = req.getParameter("divide");
		
//		switch (ans) {
//		case "+": 
//			int plus = (num + nameinguser);
//			System.out.println(" Result Is " + plus);
//			resp.getWriter().print(" Result Is " + plus);
//			break;
//		case "-":
//			int substracted = (num - nameinguser);
//			System.out.println(" Result Is " + substracted);
//			resp.getWriter().print(" Result Is " + substracted);
//			break;
//		case "*":
//			int multi = (num * nameinguser);
//			System.out.println(" Result Is " + multi);
//			resp.getWriter().print(" Result Is " + multi);
//			break;
//		case "/":
//			int devided = (num / nameinguser);
//			System.out.println(" Result Is " + devided);
//			resp.getWriter().print(" Result Is " + devided);
//			break;
//		
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + ans);
//		}
		
		switch (ans) {
        case "+":
            System.out.println("Result: " + (num + nameinguser));
            resp.getWriter().print("Result: " + (num + nameinguser));
            break;
        case "-":
            System.out.println("Result: " + (num - nameinguser));
            resp.getWriter().print("Result: " + (num - nameinguser));
            break;
        case "*":
            System.out.println("Result: " + (num * nameinguser));
            resp.getWriter().print("Result: " + (num * nameinguser));
            break;
        case "/":
            System.out.println("Result: " + (num / nameinguser));
            resp.getWriter().print("Result: " + (num / nameinguser));
            break;
        default:
            System.out.println("Invalid Operation!");
    }
		
		
		}

	}

