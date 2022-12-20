package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet 
{
		
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    //Cookie
	    
	    /*Cookie ck[]=request.getCookies();  
	    out.print("<h2>Hello "+ck[0].getValue()+"<h2>");  
		out.print("<h3>Thank You</h3>");*/
	    
	    //URL rewriting && Hidden Form Field
	    /*String name = request.getParameter("user");
	    out.print("<h2>Hello "+name+"<h2>");  
		out.print("<h3>Thank You</h3>");*/
	    
	    
	    //Http Session
	    HttpSession session=request.getSession(false);  
        String n=(String)session.getAttribute("user");  
        out.print("<h2>Hello "+n+"<h2>");
		out.print("<h3>Thank You</h3>");

		
		
	}
}