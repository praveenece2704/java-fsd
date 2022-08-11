package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductDetail")
public class ProductDetail extends HttpServlet {

		private static final String url = "jdbc:mysql://localhost:3306/db_world";
	    private static final String user = "root";
	    private static final String password = "root";

	    // JDBC variables for opening and managing connection
	    private static Connection con;
	    private static Statement stmt;
	    private static ResultSet rs;
	    PreparedStatement prSt;
	    
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			{
			int pid=Integer.parseInt(request.getParameter("id"));
			 PrintWriter out=response.getWriter();
	          String query1= "select * from productdetails where productid="+pid;
	    	
	    	  try {     	
	        	try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}  	
	            // opening database connection to MySQL server
	            con = DriverManager.getConnection(url, user, password);

	            // getting Statement object to execute query
	            stmt = con.createStatement();

	    	   rs = stmt.executeQuery(query1); 
	    	
	           boolean i=rs.next();
	           if(i==true)
	           {
	        	out.println("<form style='text-align:center;color:black;background-color:powderblue;font-size:30px'>");
	    	   out.println("Product Id is "+rs.getInt(1)+"<br>Product Name is "+rs.getString(2)+"<br>Supplier Id is "+rs.getInt(3)+"<br>Category Id is "+rs.getInt(4)+"<br>Availablility Count is "+rs.getInt(5)+"<br>Review of the product is "+rs.getString(6)+"<br>Rating of the product is "+rs.getInt(7));
	           out.println("</form>");
	           }
	           else
	           {
	        	   out.println("Product Detail is not found");
	           }
	       }
	    	catch (SQLException sqlEx) {
	            sqlEx.printStackTrace();
	        } finally {
	            //close connection ,stmt and resultset here
	            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
	        }
		}
		}
}
