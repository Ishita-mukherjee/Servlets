package com.acc.lkm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContext extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context=(ServletContext) getServletContext();
		String param_value=context.getInitParameter("context_param");
		
		PrintWriter out=response.getWriter();
		out.print("<h2> Param Value = "+ param_value);
	}

}
