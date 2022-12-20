package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class SecondServletGeneric extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("Generic Servlet");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>Output from Generic servlet</h1");

	}

}
