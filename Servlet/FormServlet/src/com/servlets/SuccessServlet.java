package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
	
		System.out.println("In do get method");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>Successfully Registered</h1>");
	}
}
