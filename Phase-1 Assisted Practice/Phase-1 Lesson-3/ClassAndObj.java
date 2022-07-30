package APracticeL3;

public class ClassAndObj {
	
	double areaOfCircle;
	
	public double area(int a,int b)
	{
		areaOfCircle=a*b*3.14;
		return areaOfCircle;
	}
	
	public static void main(String[] args)
	{
		ClassAndObj c=new ClassAndObj();      //Object creation 
		
		System.out.println(c.area(2,3));
	}


}
