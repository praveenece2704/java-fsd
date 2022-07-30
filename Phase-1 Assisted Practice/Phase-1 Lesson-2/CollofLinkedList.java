package AssistedPrograms;

import java.util.*;

public class CollofLinkedList {
	
	public static void main(String[] args)
	{
	
	LinkedList<Integer> l1=new LinkedList<Integer>();
	
	l1.add(10);
	l1.add(12);
	l1.add(14);
	l1.add(15);
	
	System.out.println(l1);
	
	System.out.println(l1.get(0));
	
	l1.set(2, 100);
	System.out.println(l1);
	
	l1.remove(1);
	System.out.println(l1);
	
	Iterator value= l1.iterator();
	
	while(value.hasNext())
	{
		System.out.print(value.next()+" ");
	}
	}
}
