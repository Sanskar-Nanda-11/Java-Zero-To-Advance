package com.besant.packages.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AuthenticationService {

	public void orgSignup(HttpServletRequest req, HttpServletResponse resp);
	public void orgLogin(HttpServletRequest req, HttpServletResponse resp);
	public void userSignup(HttpServletRequest req, HttpServletResponse resp);
	public void userLogin(HttpServletRequest req, HttpServletResponse resp);
	
}
