package APracticeL3;

class Product{
	public int id=78;
	public String name="Amul";
	
	public void display()
	{
	System.out.println(id+" "+name);
	}
	
}
class A extends Product{
	public int count=50;
	public String category="butter";
	
	public void display()
	{
		System.out.println("Product id is: "+id);
		System.out.println("Product Name is: "+name);
		System.out.println("Count of product is: "+count);
		System.out.println("Category of product is: "+category);
		
	}
}
class B extends Product{
	public int count=90;
	public String category="Milk";
	
	public void display()
	{
		System.out.println("Product id is: "+id);
		System.out.println("Product Name is: "+name);
		System.out.println("Count of product is: "+count);
		System.out.println("Category of product is: "+category);
		
	}
}
class C extends Product{
	public int count=56;
	public String category="Choco";
	
	public void display()
	{
		System.out.println("Product id is: "+id);
		System.out.println("Product Name is: "+name);
		System.out.println("Count of product is: "+count);
		System.out.println("Category of product is: "+category);
		
	}
}

class SubA extends A{
	public int price=30;
	public int total_price;
	
	public void display()
	{
		total_price=price*count;
		System.out.println("Total price of product is: "+total_price);
		System.out.println("ProductID is: "+id+" ProductNAME is: "+name+" ProductCategory is: "+category);
	}
}
class SubB extends B{
	public int price=10;
	public int total_price;
	
	public void display()
	{
		total_price=price*count;
		System.out.println("Total price of product is: "+total_price);
		System.out.println("ProductID is: "+id+" ProductNAME is: "+name+" ProductCategory is: "+category);
	}
}

public class Inheritance {
	
	public static void main(String[] args)
	{
		Product p=new Product();
		SubA a=new SubA();
		SubB b=new SubB();
		C c_var=new C();
		p.display();
		a.display();
		b.display();
		c_var.display();
	}

}
