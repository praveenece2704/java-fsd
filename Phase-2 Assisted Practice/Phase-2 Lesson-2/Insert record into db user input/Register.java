package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int id=Integer.parseInt(request.getParameter("empid"));
		String name=request.getParameter("empname");
		String salary=request.getParameter("salary");
		
		String query = "insert into emp(empid,empname,salary) values(?,?,?)";
		PrintWriter out=response.getWriter();
	      try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_world","root","root");
	           
	            PreparedStatement prSt = con.prepareStatement(query);
	            
	            prSt.setInt(1,id);
	            prSt.setString(2, name);
	            prSt.setString(3, salary);
	            int i=prSt.executeUpdate();
	            
	            if(i>0)
	            {
	            	out.println("Inserted Successfully");
	            }
	          
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
		
	        }
	}

}
