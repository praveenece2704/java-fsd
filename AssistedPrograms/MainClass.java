package AssistedPrograms;

class Outer
{
	class Inner
	{
		public double radius;
	
		public double AreaofCircle(int n)
		{
			radius=n;
			return radius*radius*3.14;
		}
	}
}

public class MainClass {

	public static void main(String[] args) {
		Outer.Inner obj=new Outer().new Inner();
		
		double result=obj.AreaofCircle(5);
		System.out.println(result);
	}

}
