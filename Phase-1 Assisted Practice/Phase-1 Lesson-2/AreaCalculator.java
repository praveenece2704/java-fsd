package AssistedPrograms;

public class AreaCalculator {
	
	public int calculate(float a,float b)
	{
		return (int)(a+b);
	}
	public int calculate(int r)
	{
		return (int)(3.14*r*r);
	}
	public int calculate(int l,float b)
	{
		return (int)(l*b);
	}
	public int calculate(float s)
	{
		return (int)(s*s);
	}

	public static void main(String[] args) {
		
		AreaCalculator a=new AreaCalculator();
		int sum =a.calculate(1.34f,25.06f);
		int circlearea =a.calculate(4);
		int rectanglearea= a.calculate(4,5.6f);
		int squarearea=a.calculate(10.5f);
		
		System.out.println("Addition of two numbers "+sum);
		System.out.println("Area of circle "+circlearea);
		System.out.println("Area of rectangle "+rectanglearea);
		System.out.println("Area of square "+squarearea);
		
	}

}
