package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class WelComeServlet implements Servlet {
	
	public void init(ServletConfig arg0) throws ServletException {
			
			
		}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:blue' align = 'center'>");
		out.println("Welcome to first servlet program");
		out.println("</h1></body></html>");
		
	}

	public ServletConfig getServletConfig() {
		
		return null;
	}

	
	public String getServletInfo() {
		
		return null;
	}
	
	public void destroy() {
		
		
	}

	

	
}
