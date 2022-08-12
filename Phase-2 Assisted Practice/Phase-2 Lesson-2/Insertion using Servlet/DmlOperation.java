package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DmlOperation")
public class DmlOperation extends HttpServlet {
	private static final String url = "jdbc:mysql://localhost:3306/db_world";
    private static final String user = "root";
    private static final String password = "root";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static PreparedStatement prSt;
    private static Statement stmt;
    private static ResultSet rs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	DmlOperation pse=new DmlOperation();
    	
    	int sid = Integer.parseInt(request.getParameter("id"));
        int sage= Integer.parseInt(request.getParameter("sage"));
        
        String sname =request.getParameter("sname");

    	PrintWriter out=response.getWriter();
        String query = "insert into student(studId,studName,studAge) values(?,?,?)";
    
	      try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection(url, user, password);
	           
	            prSt = con.prepareStatement(query);
	           
	     
	            prSt.setInt(1, sid);
	            prSt.setString(2, sname);
	            prSt.setInt(3, sage);
	            
	            int count = prSt.executeUpdate();
	            
	            //show the number of records
	            stmt = con.createStatement();
	            
	            String query1 = "select * from student";
	            ResultSet rs =  stmt.executeQuery(query1);
	            out.println("<form style='text-align:center;color:black;background-color:powderblue;font-size:30px'>");
	            out.println("Id    Name    Age<br>");
	            out.println("</form>");
	            while (rs.next()) {
	               int id = rs.getInt("studId");
	               String name = rs.getString("studName");
	               String age = rs.getString("studAge");
	               out.println("<form style='text-align:center;color:black;background-color:powderblue;font-size:30px'>");
	               out.println(id + "    " + name+"  "+age+"<br>");
	               out.println("</form>");
	            }    
	            
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally{
	            try{
	                if(prSt != null) prSt.close();
	                if(con != null) con.close();
	            } catch(Exception ex){}
	        }
    	}
}
