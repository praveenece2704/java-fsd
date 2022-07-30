package APracticeL3;
import java.lang.Runnable;
import java.lang.Thread;
class EThread extends Thread{   ///extending thread class
	
	public void run()
	{
		System.out.println("Thread using Extend class");
	}
}
class RThread implements Runnable{
	public void run()
	{
		System.out.println("Thread using Runnable interface");
	}
}

public class MultiThread{
	public static void main(String[] args) {
		//extends 
		EThread e=new EThread();
		e.start();
		
		//runnable
		RThread r=new RThread();
		Thread t=new Thread(r);
		t.start();
	}
}

