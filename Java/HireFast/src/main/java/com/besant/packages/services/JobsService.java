package com.besant.packages.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface JobsService {
	public void postJob(HttpServletRequest req, HttpServletResponse resp);
}
