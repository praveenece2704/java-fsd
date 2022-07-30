package AssistedPrograms;

public class TypeCasting {

	public static void main(String[] args) {
		
		int age=34;
		System.out.println("Age of a person is: "+age);
		
		long l=age;
		System.out.println("After implicit type casting from integer to long: "+l);
		
		//declaring a variables
		long longvar=12753L;
		double d=29746.46;
		float f=longvar;            //implicit type casting from int to long
		float f1=age;            //implicit type casting from int to float
		double d1=f;             //implicit type casting from float to long
		
		
		System.out.println("After casting from long to float is : "+f);
		System.out.println("After casting from integer to float is : "+f1);
		System.out.println("After casting from integer to double is : "+d1);
		
		char c='a';
		int n=c;                 //implicit type casting
		System.out.println("After casting from character to integer is : "+n);
		
		
		int n2=(int)f;           //explicit type casting
		float f2=(float)d;     //explicit type casting
		char c2=(char)n;         //explicit type casting
		byte b= (byte)n2;          //explicit type casting 
		
		System.out.println("After casting from float to integer is :"+n2);
		System.out.println("After casting from double to float is : "+f2);
		System.out.println("After casting from integer to character is : "+c2);
		System.out.println("After casting from integer to byte is "+b);
		

	}

}
