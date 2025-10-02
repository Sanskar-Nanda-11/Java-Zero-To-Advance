package com.besant.packages.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.packages.service.impl.ApplyJobServiceImpl;
import com.besant.packages.services.ApplyJobService;

@WebServlet("/applyJob")
public class ApplyJobController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplyJobService service = new ApplyJobServiceImpl();
		service.postApplication(req, resp);
	}
}
