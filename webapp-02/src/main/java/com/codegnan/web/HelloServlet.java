package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet implements Servlet {
       
    /**
     * @see ServletException#ServletException()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
       
    /**
     * @see ServletException#ServletException(String)
     */
    public HelloServlet(String message) {
        super();
        // TODO Auto-generated constructor stub
    }
       
    /**
     * @see ServletException#ServletException(String, Throwable)
     */
    public HelloServlet(String message, Throwable rootCause) {
        super();
        // TODO Auto-generated constructor stub
    }
       
    /**
     * @see ServletException#ServletException(Throwable)
     */
    public HelloServlet(Throwable rootCause) {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Second servlet program</h2></body></html>");
		
	}

}
