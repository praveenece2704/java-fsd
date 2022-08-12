package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");

		if(username.equalsIgnoreCase("praveen")&& password.equals("dhivi"))
		{
			RequestDispatcher d=request.getRequestDispatcher("SuccessServlet");
			d.forward(request, response);
		}
		else
		{
			RequestDispatcher d=request.getRequestDispatcher("Login.html");
			PrintWriter out=response.getWriter();
			d.include(request, response);
			out.print("<center><span style='color:red'>Please,enter the correct password and username</span></center>");
		}
		
	}

}
