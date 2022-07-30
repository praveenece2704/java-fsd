package Practice;


import java.util.Scanner;

public class ArCalculator {
	
	public static void main(String[] args)
	{
	   double n1,n2,sum,sub,mul,div;
	   String oper;
	   System.out.println("Welcome....");
	   
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.print("Enter the number1 : ");
	   n1=sc.nextDouble();
	   
	   System.out.print("Enter the number2 : ");
	   n2=sc.nextDouble();
	   
	   System.out.print("Enter the Operation Do you want to perform : ");
	   oper=sc.next();
	   
	   
	   switch(oper)
	   {
	   case "+":
		   System.out.println("Addition of two number is : "+(n1+n2));
		   break;
		   
	   case "-":
		   System.out.println("Subtraction of two number is : "+(n1-n2));
		   break;
		   
	   case "*":
		   System.out.println("Multiplication of two number is : "+(n1*n2));
		   break;
		   
	   case "/":
		   System.out.println("Dision of two number is : "+(n1/n2));
		   break;
		   
	   case "%":
		   System.out.println("Modulo of two number is : "+(n1%n2));
		   break;
		   
	   default:
		   System.out.println("Please select Mathematical operation Symbol");
		   break;
		   
	   }
	   System.out.println("Thankyou...");
	}

}
