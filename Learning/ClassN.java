package Learning;

public class ClassN {

	protected long n1=49;
	public int n2=12;
	double n3=2383.56;
	
	public void methodofpublicN()
	{
		System.out.println("Class N: public method");
		methodofprivateN();
	}
	protected void methodofprotectedN()
	{
		System.out.println("Class N: Protected method");
	}
	void methodofdefaultN()
	{
		System.out.println("Class N: Default method");
	}
	private void methodofprivateN()
	{
		//System.out.println("Class N: private method");
		System.out.println("Value of n1 "+n1);
		System.out.println("Value of n2 "+n2);
		System.out.println("Value of n3 "+n3);
	}
}
