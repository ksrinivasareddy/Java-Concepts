package com.codegnan.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		//String uemail = request.getParameter("uemail");
		out.println("<html><body>");
		//out.println("User Name"+uname+"<br>");
		//out.println("User password"+upwd+"<br>");
		//out.println("user email:"+uemail+"<br>");
		out.println("<h1 style='color:red' align = 'center'>");
		if(uname.equals("codegnan") && upwd.equals("codegnan123")) {
			out.println("Login successful");
		}
		else {
			out.println("Login fail");
		}
		out.println("</h1>");
		out.println("<h3 align = 'center'>");
		out.println("<a href='./loginform.html'>|login form| </a>");
		out.println("</body></html");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
