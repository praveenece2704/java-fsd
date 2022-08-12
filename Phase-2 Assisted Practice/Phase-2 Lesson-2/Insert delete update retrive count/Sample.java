package com;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.Scanner;


public class Sample {

	// JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/db_world";
    private static final String user = "root";
    private static final String password = "root";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static PreparedStatement prSt;
    private static Statement stmt;
    private static ResultSet rs;

public static void main(String[] args) {
		
		Sample pse = new Sample();
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.println("=============PREPARED STATEMENT MENU=================");
        System.out.println("1. Insert the new student Record"); 
        System.out.println("2. Update the student Record");
        System.out.println("3. Delete the student Record");
        System.out.println("4. Retrive the student Record");
        System.out.println("5. Count the student Record");
        System.out.println("====================================================");
    	System.out.println("Enter your choice from (1-3): ");
    	
    	int number = input.nextInt();
    	System.out.println("You entered option" + number);
    	
    	switch(number)
    	{
    	case 1: pse.insertPSRecord();
    	        break;
    	
    	case 2: pse.updatePSRecord();
    	        break;
    	        
    	case 3: pse.deletePSRecord();
    	        break;
    	        
    	case 4: pse.retrieveData();
    	        break;
    	    
    	case 5: pse.countEmployees();
    	        break;
    	}	
        	
	}
	
	//-------------------------- Inserting The Record-----------------------------//
	public void insertPSRecord()
    {  
		String query = "insert into student(studId,studName,studAge) values(?,?,?)";
		
	      try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection(url, user, password);
	           
	            prSt = con.prepareStatement(query);
	            
	            // Take user input for insertion
	            Scanner input = new Scanner(System.in);	
	            
	            System.out.print("Enter the studid:  ");
	            int sid = input.nextInt();
	            System.out.println();
	            
	            System.out.print("Enter the studAge:  ");
	            int sage = input.nextInt();
	            System.out.println();
	            
	            System.out.print("Enter the studName:  ");
	            String sname = input.next();
	            System.out.println();
	            
	            prSt.setInt(1, sid);
	            prSt.setString(2, sname);
	            prSt.setInt(3, sage);
	            
	            int count = prSt.executeUpdate();
	            
	            //show the number of records
	            stmt = con.createStatement();
	            
	            String query1 = "select * from student";
	            ResultSet rs =  stmt.executeQuery(query1);
	            System.out.println("Id    Name    Age");
	            
	            while (rs.next()) {
	               int id = rs.getInt("studId");
	               String name = rs.getString("studName");
	               String age = rs.getString("studAge");
	               System.out.println(id + "    " + name+"    "+age);
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
	
	//-------------------------- Updating The Record-----------------------------//
	public void updatePSRecord()
    { 
		String sqlUpdate = "UPDATE student SET studAge = ? WHERE studId = ?";
		
		try {
            try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
            prSt = con.prepareStatement(sqlUpdate);
            
            // Take user input for insertion
            Scanner input = new Scanner(System.in);	
            
            System.out.print("Enter the stuId:  ");
            int sid = input.nextInt();
            System.out.println();
            
            System.out.print("Enter the stuAge:  ");
            int sage  = input.nextInt();
            System.out.println();
            
            prSt.setInt(1, sage);
            prSt.setInt(2, sid);
 
            int rowAffected = prSt.executeUpdate();
            System.out.println(String.format("Row affected %d", rowAffected));
 
		}
		catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }		
    }
	
	//-------------------------- Deleting The Record-----------------------------//
		public void deletePSRecord()
	    { 
			String sqlUpdate = "DELETE from student where studId=?";
			
			try {
	            try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection(url, user, password);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
	            prSt = con.prepareStatement(sqlUpdate);
	            
	            // Take user input for insertion
	            Scanner input = new Scanner(System.in);	
	            
	            System.out.print("Enter the studid:  ");
	            int sid = input.nextInt();
	            System.out.println();
	            
	            prSt.setInt(1, sid);
	            prSt.executeUpdate();
	            
	            System.out.println("Record deleted successfully");
			}
			catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }				
	    }
		public void retrieveData()
	    {
	    	String query1= "select * from student";
	    	
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
	    	
	    	while (rs.next()) 
	    	{ 
	    	   int id = rs.getInt(1); 
	    	   String name = rs.getString(2); 
	    	   int age = rs.getInt(3); 
	    	   System.out.printf("student id : %d, student name: %s, student age : %d %n", id, name, age); 
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
	    
	    public void countEmployees()
	    {
	    	String query = "select count(*) from student";

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

	            // executing SELECT query
	            rs = stmt.executeQuery(query);

	            while (rs.next()) {
	                int count = rs.getInt(1);
	                System.out.println("Total number of employees in the company : " + count);
	            }

	        } catch (SQLException sqlEx) {
	            sqlEx.printStackTrace();
	        } finally {
	            //close connection ,stmt and resultset here
	            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
	            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
	        }
	    }
	    
}

