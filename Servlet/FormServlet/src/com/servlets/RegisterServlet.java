package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;


public class RegisterServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("test/html");
		PrintWriter out= res.getWriter();
		out.print("<h1>Welcome</h1>");
	
	}
	

}
