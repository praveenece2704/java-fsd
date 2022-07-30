package APracticeL3;

abstract class MNC{
	
	MNC(){
		System.out.println("Inside the constructor of MNC");
	}
	
	abstract void display();
	abstract void run();
	
	public void show()
	{
		System.out.println("Method of MNC class");
	}

}

abstract class Infosys extends MNC{
	
	void display()
	{
		System.out.println("Abstract method body is implemented in Infosys class");
	}
	abstract void run();
	
}

class Hello extends Infosys{
	@Override
	void run()
	{
		System.out.println("Abstract method body is implemented in Hello class ");
	}
	
	public void output()
	{
		System.out.println("Method of Hello class");
	}
	
}

public class AbstractionImp {
	
	public static void main(String[] args)
	{
		MNC m=new Hello();
		
		m.show();
		m.display();
		m.run();
		
		Hello h=new Hello();
		h.output();
		
	}

}
