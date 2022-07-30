package APracticeL3;

import java.io.*;

public class ExcepHand {
	
	static void run() throws Exception
	{
		throw new Exception("shown error");
	}
	public static void main(String[] args)
	{
		try {
			 
            File f = new File("praveen.txt");
 
            FileReader reader = new FileReader(f);
        } 
		catch (FileNotFoundException e) {
			
           System.out.println(e);
        }
		finally {
			
			System.out.println("Program Executed successfully");
		}
		
		try {
			run();
		}
		
		catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("Program Executed successfully");
		}
		try {
            
            int num = Integer.parseInt ("Lion") ;
 
            System.out.println(num);
            
        } 
		catch(NumberFormatException e) 
		{
            System.out.println(e);
        }
        finally {
			
			System.out.println("Program Executed successfully");
		}
		
	}
}
