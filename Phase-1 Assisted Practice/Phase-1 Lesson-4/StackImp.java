package APracticeL4;

public class StackImp 
{ 
    	static final int n = 1000; 
    	int top; 
    	int a[] = new int[n];  
  	boolean isEmpty() 
    	{ 
        		return (top < 0); 
    	} 
    	StackImp() 
    	{ 
        		top = -1; 
    	} 
  	boolean push(int x) 
    	{ 
        		if (top >= (n-1)) 
        		{ 
            			System.out.println("Stack Overflow"); 
            			return false; 
        		} 
        		else
        		{ 
            			a[++top] = x; 
            			System.out.println(x + " pushed into stack"); 
            			return true; 
        		} 
    	} 
               int pop() 
    	        { 
        		if (top < 0) 
        		{ 
            			System.out.println("Stack Underflow"); 
            			return 0; 
        		} 
        		else
        		{ 
            			int x = a[top--]; 
            			return x; 
        		} 
    	} 
    
    	public static void main(String args[])
{
        		StackImp s = new StackImp(); 
        		s.push(10); 
        		s.push(20); 
        		s.push(30); 
        		System.out.println(s.pop());
        		System.out.println(s.pop());
        		System.out.println(s.pop());
        		System.out.println("print the elements in stack "+s.pop());
        		
    	}
} 	
