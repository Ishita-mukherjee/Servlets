package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class FirstServlet implements Servlet{
	
	ServletConfig conf;
	
	//Life Cycle methods
	
	@Override
	public void init(ServletConfig conf) throws ServletException {
		
		this.conf=conf;
		System.out.println("Creating object");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("Servicing");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>Output from server</h1");

	}
	
	@Override
	public void destroy() {

		System.out.println("Destroying object");

	}
	
	//Non-life cycle methods

	@Override
	public ServletConfig getServletConfig() {
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		return "Servlet";
	}

	

	

}
