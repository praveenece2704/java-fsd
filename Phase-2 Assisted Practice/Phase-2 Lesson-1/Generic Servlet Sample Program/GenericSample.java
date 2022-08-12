package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class GenericSample extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("user");
		PrintWriter out=response.getWriter();
		
		out.println("welcome "+name+" by using Generic servlet");
	}

}
