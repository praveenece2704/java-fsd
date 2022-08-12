package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StoredP")
public class StoredP extends HttpServlet {
	private static final String url = "jdbc:mysql://localhost:3306/db_world";
    private static final String user = "root";
    private static final String password = "root";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    PreparedStatement prSt;
    static String sql = "{call PRODUCT_PROC1(?,?,?,?,?,?,?)}";
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int bid=Integer.parseInt(request.getParameter("bid"));
		int aid=Integer.parseInt(request.getParameter("aid"));
		int bpi=Integer.parseInt(request.getParameter("bpi"));
	
		try {
	    	  
	    	  //STEP 2: Register JDBC driver
		      try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      con = DriverManager.getConnection(url, user, password);
		      
		      CallableStatement stmt=con.prepareCall(sql);
	         
	         //Set IN parameter
	         stmt.setInt(1, bid);
	         stmt.setInt(2, aid);
	         stmt.setInt(3, bpi);
	         
	         //Set OUT parameter
	         stmt.registerOutParameter(4, Types.VARCHAR);
	         stmt.registerOutParameter(5, Types.VARCHAR);
	         stmt.registerOutParameter(6, Types.VARCHAR);
	         stmt.registerOutParameter(7, Types.INTEGER);
	         
	         //Execute stored procedure
	         stmt.execute();
	         out.println(stmt.getString(4)+" "+stmt.getString(5)+" "+stmt.getString(6)+" "+stmt.getInt(7));
	         
		} catch (SQLException e) {
	         e.printStackTrace();
	         e.getErrorCode();
	      }
	   }

}
