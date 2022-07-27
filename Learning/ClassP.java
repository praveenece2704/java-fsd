package Learning;

public class ClassP {

	public static void main(String[] args) {
		new ClassM().methodofpublicM();
		new ClassN().methodofpublicN();
		
	}

	public void methodofpublicP()
	{
		System.out.println("Class P: public method");
	}
	protected void methodofprotectedP()
	{
		System.out.println("Class P: Protected method");
	}
	void methodofdefaultP()
	{
		System.out.println("Class P: Default method");
	}
	private void methodofprivateP()
	{
		System.out.println("Class P: Private method");
	}

}
