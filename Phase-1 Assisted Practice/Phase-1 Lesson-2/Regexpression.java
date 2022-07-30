package AssistedPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		Pattern p=Pattern.compile(str);
		
		Matcher m=p.matcher("Welcome to the jungle the new world");
		
		boolean b=m.find();
		System.out.println(m.matches());
		if(b)
		{
			System.out.println("String are getting matched");
		}
		else
		{
			System.out.println("String are not matched");
		}

	}

}
