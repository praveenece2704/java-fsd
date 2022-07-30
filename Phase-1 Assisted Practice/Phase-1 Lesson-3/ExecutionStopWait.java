package APracticeL3;

import java.lang.Thread;

public class ExecutionStopWait extends Thread {
	private static Object l1=new Object();
	
	public void run()
	{
		for(int i=1;i<10;i++)
		{
		try {
			Thread.sleep(500);
			System.out.println(i);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}
		}
		
	}

	public static void main(String[] args) {
		
		ExecutionStopWait t=new ExecutionStopWait();
		t.start();
		try{
			synchronized(l1)
			{
				l1.wait(100);
				System.out.println("After waiting for 0.1 sec Executed");
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	
		try{
		for(int i=1;i<10;i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
			
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally
		{
			System.out.println("program executed successfully");
		}
		
		
		

	}

}
