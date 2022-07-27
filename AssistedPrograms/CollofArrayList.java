package AssistedPrograms;

import java.util.*;

public class CollofArrayList {
	public static void main(String[] args)
	{
	//ArrayList implementation
	ArrayList<Integer> a=new ArrayList<Integer>();
	
	a.add(1);
	a.add(2);
	a.add(3);
	
	a.add(3,10);
	System.out.println(a);
	
	a.remove(1);
	
	System.out.println(a);
	
	a.set(1, 10);
	
	for(int i=0;i<a.size();i++)
	{
		System.out.print(a.get(i)+" ");
	}
	System.out.println();
	
	for(int i:a)
	{
		System.out.print(i+" ");
	}
	}
}
