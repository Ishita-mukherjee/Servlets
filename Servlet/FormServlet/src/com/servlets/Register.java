package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		out.print("<h1>Welcome</h1>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		String cond = req.getParameter("condition");
		
		if(cond!=null)
		{
			if(cond.equals("checked"))
			{
				out.print("<h2> Name: "+ name + "</h2>");
				out.print("<h2> Email: "+ email + "</h2>");
				out.print("<h2> Gender: "+ gender + "</h2>");
				out.print("<h2> Course: "+ course + "</h2>");					

				RequestDispatcher rd = req.getRequestDispatcher("SuccessServlet");
				rd.forward(req, res);
			}
			else
			{
				out.print("<h2>You have not accpeted terms</h2>");
			}
		}
		else
		{
			out.print("<h2>You have not accpeted terms</h2>");
			
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		
	
	}
	
	}


