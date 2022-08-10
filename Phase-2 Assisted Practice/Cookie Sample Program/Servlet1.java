package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name= request.getParameter("name");
		String pass=request.getParameter("password");
		PrintWriter out=response.getWriter();
		
		Cookie ck=new Cookie("username",name);
		Cookie ck1=new Cookie("password",pass);
		
		response.addCookie(ck);
		response.addCookie(ck1);
		out.print("<form action='s2'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");
	}

}
