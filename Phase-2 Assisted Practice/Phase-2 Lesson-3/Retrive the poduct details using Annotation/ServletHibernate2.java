package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/ServletHibernate2")
public class ServletHibernate2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 try {
             PrintWriter out = response.getWriter();
             out.println("<html><body>");

             SessionFactory factory = HibernateUtil.getSessionFactory();
                    
             Session session = factory.openSession();
             
             List<Product> list = session.createQuery("from Product").list();
             
             session.close();
             
              out.println("<html><body>");
              out.println("<b>Product Listing</b><br>");
              for(Product p: list) {
                      out.println("ID: " + p.getProductid()+" "+p.getProductname()+" "+p.getProductprice()+"<br>");
              }
              
          out.println("</body></html>");
                
                 
             } catch (Exception ex) {
                     throw ex;
             }

	}

}
