package AssistedPrograms;

import java.util.*;

public class CollofStack {

	public static void main(String[] args) {
		Stack<String> str=new Stack<String>();
		String s;
		
		for(int i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			str.push(sc.nextLine());             // to add the elements to the stack  ----->push
		}
		System.out.println(str);
		
		str.pop();                               // to delete the element in the stack ------->pop
		System.out.println(str);
		
		System.out.println(str.peek());           //to get the top element in the stack without deleting ----->peek
		System.out.println(str);
		
		Object copy_str=(List)str.clone();        // clone the str to copy str object
		Object copy_str1=(Vector)str.clone();
		
		System.out.println(copy_str);
		System.out.println(copy_str1);
		 
		Iterator value= str.iterator();            //Iterator is used to get the element in iterative manner
		
		while(value.hasNext())
		{
			System.out.println(value.next());
		}

	}

}
