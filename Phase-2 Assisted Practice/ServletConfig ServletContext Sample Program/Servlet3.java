package Servlet_context_config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		ServletContext context=getServletContext();
		
		String s1=context.getInitParameter("a");
		int a=Integer.parseInt(s1);
		String s2=context.getInitParameter("b");
		int b=Integer.parseInt(s2);
		String s3=context.getInitParameter("c");
		int c=Integer.parseInt(s3);
		
		ServletConfig config=getServletConfig();
		String s4=config.getInitParameter("d");
		int d=Integer.parseInt(s4);
		
		if(a>b && a>c && a>d)
		{
			out.println("A is the largest");
		}
		else if(b>a && b>c && b>d)
		{
			out.println("B is the largest");
		}
		else if(c>a && c>b && c>d)
		{
			out.println("C is the largest");
		}
		else
		{
			out.println("D is the larges");
		}
	}

}
