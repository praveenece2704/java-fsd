package com;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DemoCreateInsertdrop {
		
		// JDBC driver name and database URL
		   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost:3306/";

		   //  Database credentials
		   static final String USER = "root";
		   static final String PASS = "root";
		   private static ResultSet rs;
		   public static void main(String[] args) {
			   Connection conn = null;
			   Statement stmt = null;
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");

			      //STEP 3: Open a connection
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);

			      //STEP 4: Execute a query
			      System.out.println("Creating database...");
			      stmt = conn.createStatement();
			      String sql="create database sample";
			      stmt.executeUpdate(sql);
			      
			      String sql1="use sample";
			      stmt.executeUpdate(sql1);
			      String sql2="create table list(id int not null,name varchar(255))";
			      stmt.executeUpdate(sql2);
			      
			      String sql3="INSERT INTO LIST VALUES(1,'Navin')";
			      stmt.executeUpdate(sql3);
			      String sql4="Insert into list values(2,'praveen')";
			      stmt.executeUpdate(sql4);
			      
			      String sql5="select * from list";
			      rs=stmt.executeQuery(sql5);
			      while(rs.next())
			      {
			      System.out.println(rs.getString(2));
			      }
			      String sql51="DROP Table list;";
			      stmt.executeUpdate(sql51);
			      
			      String sql52="drop database sample";
			      stmt.executeUpdate(sql52);
			     
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Have A Nice Day");
			}//end main
	}

