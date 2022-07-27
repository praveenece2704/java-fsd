package AssistedPrograms;

public class Shape {
	double length;
	double breadth;
    double radius;
    double rh;
    double tr;
    double side;
    static double pi;
	public Shape() {
		System.out.println("Inside the constructor");
		pi=3.14;
	}
	Shape(float b)
	{
		side=b;
	}
	Shape(float l,int b)
	{
		length=l;
		breadth=b;
	}
	Shape(int r)
	{
		radius=r;
	}
	
	void displaysquare()
	{
		System.out.println("Area of square is: "+(side*side));
	}
	void displayrectangle()
	{
		System.out.println("Area of rectangle is: "+(length*breadth));
	}
	void displaycircle()
	{
		System.out.println("Area of circle is: "+(pi)*radius*radius);
		System.out.println(pi);
	}
	
	public void Area(int p,int q)
	{
		rh=(p*q)/2;
		System.out.println("Area of rhombus is: "+rh);
	}
	public void Area(long h,float b)
	{
		tr=(h*b)/2;
		System.out.println("Area of triangle is: "+tr);
	}

	public static void main(String[] args) {
		//object creation
		Shape s=new Shape();
		Shape s1=new Shape(37.4f);         //passing parameters for constructor
		Shape s2=new Shape(4.5f,6);
		Shape s3=new Shape(6);
		
		s1.displaysquare();            //calling the display function for square
		s2.displayrectangle();         //calling the display function for rectangle
		s3.displaycircle();
		
		s.Area(5, 4);
		s.Area(30, 23.4f);
	}

}
