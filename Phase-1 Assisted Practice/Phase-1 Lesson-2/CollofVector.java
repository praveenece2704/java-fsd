package AssistedPrograms;

import java.util.*;

public class CollofVector {
	public static void main(String[] args){
	
	Vector<Integer> v=new Vector<Integer>();
	
	v.add(10);
	v.add(9);
	v.add(8);
	v.add(7);
	v.add(1);
	v.add(4);
	v.add(2);
	v.add(3);
	
	for(int i:v)
	{
		System.out.print(i+" ");
	}

	
	System.out.println();
	
	Collections.sort(v);

	
	System.out.println(v);
	
	v.clear();
	
	}
}
