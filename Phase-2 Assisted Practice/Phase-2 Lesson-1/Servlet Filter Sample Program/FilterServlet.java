package Servlet_context_config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String user=request.getParameter("username");
		String s=request.getParameter("age");
		int age=Integer.parseInt(s);
		PrintWriter out=response.getWriter();
		out.println("Welcome "+user+" your age is "+age);
	}

}
