package AssistedPrograms;

//import java.util.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class CollofList {
	public static void main(String[] args)
	{
	List<Integer> l1=new ArrayList<Integer>();
	List<Integer> l2=new ArrayList<Integer>();
	List<String> l3=new ArrayList<String>();
	List<Integer> l4=new Vector<Integer>();
	List<Integer> l5=new Stack<Integer>();
	List<Integer> l6=new LinkedList<Integer>();
	
	String str;
	
	
	//list Interface with ArrayList class
	l1.add(1);
	l1.add(2);    //adding the element to the list
	l1.add(3);
	l1.add(3,4); //adding the element to the list at specified index 
	
	
	System.out.println(l1);
	
	for(int i=5;i<10;i++)
	{
		l1.add(i);
	}
	System.out.println(l1);
	
	l1.remove(5);    // remove the element at specified index
	l1.set(5, 10);   // setting the element to specified index
	System.out.println(l1);           //display all the elements in the list
	
	l2.addAll(l1);                    //adding all elements in l1 to the list l2
	System.out.println(l2);
	
	//list Interface with linkedlist class
		l6.add(44);
		l6.add(55);
		
		System.out.println(l6);
		
		//list Interface with Stack class
		l5.add(10);
		l5.add(20);
		
		System.out.println(l5);
		
		//list Interface with Vector class
		l4.add(11);
		l4.add(22);
		
		System.out.println(l4);
		
		for(int i=0;i<3;i++)
		{
			Scanner sc=new Scanner(System.in);      
			str=sc.nextLine();
			l3.add(str);
		}
		System.out.println(l3);
		
		l3.add(1,"praveen");      //adding praveen to the index 1
		
		System.out.println(l3);
		
		for(String s:l3)
		{
			System.out.print(s+ " ");
		}

}
}
