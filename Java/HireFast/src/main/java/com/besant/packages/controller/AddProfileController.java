package com.besant.packages.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.packages.service.impl.AddProfileServiceImpl;
import com.besant.packages.services.AddProfileService;

@WebServlet("/addProfile")
public class AddProfileController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AddProfileService service = new AddProfileServiceImpl();
		service.addProfile(req, resp);
	}
}
