package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name= request.getParameter("name");
		String pass=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		
		if("praveen".equals(name) && "praveen@123".equals(pass))
		{
			out.println("welcome "+name);
			out.println("<a href='log2?'>Logout</a>");
		}
		else
		{
			out.println("Oops.. Please enter the correct password");
			RequestDispatcher r=request.getRequestDispatcher("SesLoginLogout.html");
			r.include(request, response);
		}
				
	}

}
