package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ServletInterface")
public class ServletInterface implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ServletInterface() {
        super();
        // TODO Auto-generated constructor stub
    }

    ServletConfig config=null;
    public void init(ServletConfig config){
        this.config=config;
        System.out.println("Initialization complete");
     }

     public void service(ServletRequest req,ServletResponse res)
     throws IOException,ServletException{
         res.setContentType("text/html");
         PrintWriter pwriter=res.getWriter();
         pwriter.print("<html>");
         pwriter.print("<body>");
         pwriter.print("In the service() method<br>");
         pwriter.print("</body>");
         pwriter.print("</html>");
     }
     public void destroy(){
         System.out.println("In destroy() method");
     }
     public ServletConfig getServletConfig(){
         return config;
     }
     public String getServletInfo(){
         return "This is a sample servlet info";
     }
}

