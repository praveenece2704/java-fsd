package AssistedPrograms;

public class ExStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Started Java");
		
		sb.append("Phase1");       //appending the word to the string sb
		
		System.out.println(sb);
		
		sb.delete(2,5);
		
		System.out.println(sb); 
		
		sb.replace(5, 9, "Python ");   //replacing the java with python
		
		System.out.println(sb);
		
		sb.insert(5, "language ");
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		System.out.println(sb.charAt(9));
		
	}

}
