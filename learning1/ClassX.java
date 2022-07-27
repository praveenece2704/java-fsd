package learning1;

public class ClassX {

	  private int x1=96;
	  long x2=195;
	  protected float x3=28.4f;
	  public char x4='D';
	  
	public void methodofpublicX()
	{
		System.out.println("Class X: public method");
		methodofprivateX();
	}
	protected void methodofprotectedX()
	{
		System.out.println("Class X: Protected method");
	}
	void methodofdefaultX()
	{
		System.out.println("Class X: Default method");
	}
	private void methodofprivateX()
	{
		//System.out.println("Class X: Private method");
		System.out.println("Value of x1 "+x1);
		System.out.println("Value of x2 "+x2);
		System.out.println("Value of x3 "+x3);
		System.out.println("Value of x4 "+x4);
	}

}
