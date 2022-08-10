package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSession2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession(false);
		
		String n=(String)session.getAttribute("username");
		String c=(String)session.getAttribute("city");
		
		PrintWriter out=response.getWriter();
		out.println("Welcome "+n+"Your city name is "+c);
	}
	

}
