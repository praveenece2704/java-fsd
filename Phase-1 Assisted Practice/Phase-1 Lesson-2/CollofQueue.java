package AssistedPrograms;

import java.util.*;

public class CollofQueue {
	
	public static void main(String[] args)
	{
		Queue<Integer> q=new LinkedList<Integer>();  //Queue interface with LinkedList class
		
		//add the elements to the queue 
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		
		System.out.println(q);
		
		int var=q.remove(); //to remove head of the queue
		
		System.out.println("First element enter into the queue is : "+var);
		
		q.clear();
		
		Queue<String> q1=new LinkedList<String>();
		
		q1.add("praveen");
		q1.add("kumar");
		q1.add("hulk");
		q1.add("strange");
		q1.add("sider");
		
		System.out.println(q1);
		
		q1.remove();
		q1.remove();
		
		System.out.println(q1);
		
        Queue<String> q2=new PriorityQueue<String>();   //implementation using PriorityQueue class in queue interface
		
		q2.add("praveen");
		q2.add("kumar");
		q2.add("hulk");
		q2.add("strange");
		q2.add("spider");
		
		System.out.println(q2);
		
		q2.remove();
		q2.remove();
		
		System.out.println(q2);
		
		
		
		
		
		
	}
	

}
