package com.besant.packages.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ApplyJobService {
	public void postApplication(HttpServletRequest req, HttpServletResponse resp);
}
