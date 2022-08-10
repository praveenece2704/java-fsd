package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HiddenformField1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		
		
		PrintWriter out=response.getWriter();
		out.println("Welcome "+name);
		out.println("<form action='hidden2' method='get'>");
		out.println("<input type='hidden' name='username' value="+name+">");
		out.println("<input type='hidden' name='city' value="+city+">");
		out.println("<input type='submit'>");
		out.println("</form>");
		
		out.close();
	}

}
