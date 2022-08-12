package sample.jdbc.program;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcedureExample {
	
	static String url = "jdbc:mysql://localhost:3306/db_world";
    static String user = "root";
    static String password = "root";
    static String sql = "{call PRODUCT_PROC1(?,?,?,?,?,?,?)}";
    
	private static Connection con;
	
   public static void main(String[] args) {
      
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
         stmt.setInt(1, 4);
         stmt.setInt(2, 2);
         stmt.setInt(3, 700);
         
         //Set OUT parameter
         stmt.registerOutParameter(4, Types.VARCHAR);
         stmt.registerOutParameter(5, Types.VARCHAR);
         stmt.registerOutParameter(6, Types.VARCHAR);
         stmt.registerOutParameter(7, Types.INTEGER);
         
         //Execute stored procedure
         stmt.execute();
         
         // Get Out and InOut parameters
         System.out.println("Author = "+stmt.getString(4));
         System.out.println("Gender = "+stmt.getString(5));
         System.out.println("Book Name = "+stmt.getString(6));
         System.out.println("Page = "+stmt.getInt(7));
      } catch (SQLException e) {
         e.printStackTrace();
         e.getErrorCode();
      }
   }
}
