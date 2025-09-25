package com.besant.packages.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.packages.service.impl.AuthenticationServiceImpl;
import com.besant.packages.services.AuthenticationServices;

@WebServlet("/orgLogin")
public class OrgLoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stud
		AuthenticationServices service = new AuthenticationServiceImpl();
		service.orgLogin(req, resp);
	}
}
