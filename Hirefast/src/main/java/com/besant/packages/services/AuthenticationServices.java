package com.besant.packages.services;

//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AuthenticationServices {
	public void orgSignUp(HttpServletRequest req , HttpServletResponse resp);
	public void orgLogin(HttpServletRequest req , HttpServletResponse resp);
	public void userSignUp(HttpServletRequest req , HttpServletResponse resp);
	public void userLogin(HttpServletRequest req , HttpServletResponse resp);
}
