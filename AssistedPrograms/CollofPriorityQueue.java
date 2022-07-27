package AssistedPrograms;

import java.util.*;

public class CollofPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("praveen");
		pq.add("kumar");
		pq.add("Welcome");
		pq.add("Hello");
		pq.add("world");
		pq.add("enjoy");
		
		System.out.println(pq);
		
		pq.peek();
		
		System.out.println(pq);
		
		pq.poll();     
		
		System.out.println(pq);
		
		Iterator value= pq.iterator();
		
		while(value.hasNext())
		{
			System.out.print(value.next()+" ");
		}

	}

}
