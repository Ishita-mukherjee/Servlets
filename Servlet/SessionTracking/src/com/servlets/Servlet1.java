package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet 
{
		
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name= request.getParameter("user_name");
				
		//Cookie
		/*Cookie ck=new Cookie("user_name",name);  
	    response.addCookie(ck);  */
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Name is: "+name+"</h1><br>");
		out.print("<a href='s2'>Go to Servlet 2</a>");
		
		//URL rewriting
		//out.print("<a href='s2?user="+name+"'>Go to Servlet 2</a>");
		
		//Hidden Form Field
		/*out.print("<form action='s2'>"
				+ "<input type = 'hidden' name = 'user' value='"+name+"'>"
				+ "<button>Go to servlet2</button>"
				+ "</form>");*/
		
		//HttpSession
        HttpSession session=request.getSession();  
        session.setAttribute("user",name);  


		
		
		
		

		
		
	}

}
