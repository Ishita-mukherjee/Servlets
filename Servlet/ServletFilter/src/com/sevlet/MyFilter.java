package com.sevlet;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public boolean accept(Object arg0) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException
	{
		System.out.println("Before Filter");
		chain.doFilter(req, res);
		System.out.println("After Servlet");

	}

}
