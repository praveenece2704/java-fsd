package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/OperServlet")
public class OperServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		String preview=request.getParameter("preview");
		int prating=Integer.parseInt(request.getParameter("prating"));
		int sid=Integer.parseInt(request.getParameter("sid"));
		int cid=Integer.parseInt(request.getParameter("cid"));
		int pprice=Integer.parseInt(request.getParameter("pprice"));
		
		product p=new product(pid,pname,preview,prating,sid,cid,pprice);
		
		HttpSession session=request.getSession();
		session.setAttribute("Details", p);
		session.setAttribute("pid", p.productid);
		session.setAttribute("pname",p.productname);
		session.setAttribute("preview",p.productreview);
		session.setAttribute("prating", p.productrating);
		session.setAttribute("sid", p.supplierid);
		session.setAttribute("cid", p.customerid);
		session.setAttribute("pprice", p.productprice);
		RequestDispatcher rd=request.getRequestDispatcher("last.jsp");
		rd.forward(request, response);
		//response.sendRedirect("last.jsp");
		
	}

}
