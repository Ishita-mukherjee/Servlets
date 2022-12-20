package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int nn1 = Integer.parseInt(request.getParameter("n1"));
		int nn2 = Integer.parseInt(request.getParameter("n2"));
		
		int p = nn1*nn2;
		//System.out.println(p);
		
		int sum = (int)request.getAttribute("sum");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Sum is: "+sum+"</h1>");
		out.print("<h1>Product is: "+p+"</h1>");
	
	}

}
