package com.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
	
		System.out.println("In do get method");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1> In Profile Servlet</h1>");
	}

}
