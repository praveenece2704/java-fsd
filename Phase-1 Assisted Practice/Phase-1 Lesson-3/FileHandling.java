package APracticeL3;

import java.io.*;
import java.util.*;

public class FileHandling {
	public static void main(String[] args) throws IOException
	{
		    //creating the new file
			File obj = new File("myfile.txt");
			if(obj.createNewFile())                      
	        {  
	        System.out.println(obj.getName() + " file is  created");  
	        }  
	        else  
	        {  
	        System.out.println("failed");  
	        }  
		//	System.out.println("File Created!");
			if(obj.delete())                      
	        {  
	        System.out.println(obj.getName() + " file is deleted");  
	        }  
	        else  
	        {  
	        System.out.println("failed");  
	        }  
			
		    System.out.println(obj.getName());
		    
		    //writing the content to the file
		    FileWriter Writer= new FileWriter("myfile.txt");
		    
            Writer.write("Welcome to the java family!!!");
            
            Writer.close();
            
            System.out.println("Successfully written.");
            
            //reading the data from the file
            Scanner reader=new Scanner(obj);
            while(reader.hasNext())
            {
            	String str=reader.nextLine();
            	System.out.println(str);
            }
            
            //deleting the file
           // File obj= new File("myfile.txt");           //file to be delete  
           
	}
}	
