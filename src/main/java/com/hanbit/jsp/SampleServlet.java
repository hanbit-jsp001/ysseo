package com.hanbit.jsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet {

	protected void service(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException{
		resp.getOutputStream().println("Sample");
		resp.flushBuffer();
	}
}
