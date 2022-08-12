package Assisted;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DogetImp")
public class DogetImp extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("n1");
		int a=Integer.parseInt(s1);
		String s2=request.getParameter("n2");
		int b=Integer.parseInt(s2);
		
		PrintWriter out=response.getWriter();
		out.println("Sum of a and b is "+(a+b));
	}

}
