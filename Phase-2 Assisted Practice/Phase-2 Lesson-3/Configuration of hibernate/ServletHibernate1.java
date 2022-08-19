package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/ServletHibernate1")
public class ServletHibernate1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               try {
                       PrintWriter out = response.getWriter();
                       out.println("<html><body>");

                       SessionFactory factory = HibernateUtil.getSessionFactory();
                              
                       Session session = factory.openSession();
                       out.println("Hibernate Session opened.<br>");
                       session.close();
                       out.println("Hibernate Session closed.<br>");
                              
                       out.println("</body></html>");
                          
                           
                       } catch (Exception ex) {
                               throw ex;
                       }


	}

}
