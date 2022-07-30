package APracticeL3;

class Shape
{
  int area(int a,int b)
  {
	  return 0;
  }
}
class Rect extends Shape
{
//	int l=4;
//	int b=3;
	int area(int a,int b)
	{
		return a*b;
	}
}
class Triangle extends Shape
{
//	int br=4;
//	int he=13;
	int area(int a,int b)
	{
		return a*b;
	}
}
class Square extends Shape
{
//	int s=4;
	int area(int a,int b)
	{
		return a*b;
	}
}
class Rhombus extends Shape
{
//	int d1=45;
//	int d2=10;
	int area(int a,int b)
	{
		return a*b;
	}
}
public class DynamicPoly {
	public static void main(String[] args){
	
	Shape s;
	s=new Rect();
	System.out.println("Area of Reactangle : "+s.area(1,2));
	s=new Triangle();
	System.out.println("Area of Triangle : "+s.area(2,3));
	s=new Square();
	System.out.println("Area of Square : "+s.area(4,5));
	s=new Rhombus();
	System.out.println("Area of Rhombus : "+s.area(6,7));
	
	}

}
