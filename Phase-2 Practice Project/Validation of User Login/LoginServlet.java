package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		if("Praveen".equals(name) && "Praveen@123".equals(password))
		{
			out.println("Welcome "+name);
			out.print("<a href='urlwrite?'><br>Logout</a>"); 
		}
		else
		{
			out.println("<span style='color:red'>Sorry enter correct password and username</span>");
			RequestDispatcher r=request.getRequestDispatcher("loginpage.html");
			r.include(request, response);
		}	
		
	}

}
