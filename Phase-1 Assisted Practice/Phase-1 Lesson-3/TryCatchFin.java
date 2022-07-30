package APracticeL3;

public class TryCatchFin {

	public static void main(String[] args) {
		int n1=4,n2=0;
		int val;
		
		try {
			val = n1/n2;
			System.out.println(val);
		}
		
		catch (ArithmeticException e) {
			System.out.println(e+" Error is number divided by zero");
		}

		finally {
			System.out.println("Program Executed successfully");
		}

	}

}
