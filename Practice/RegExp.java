package Practice;
import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern;

public class RegExp {
	public static void main(String[] args) {
		
		String[] email = new String[20];
		
		email[0]="praveenvaithi201@gmail.com";
		email[1]="kumar@gamil.com";
		email[2]="praveen.kumar@gmail.com";
		email[3]="klion123@Gmail.com";
		email[4]="kumargobi@gmail.com";
		//invalid email ids
		email[5]="praveenvaithi*201@gmail.com";
		email[6]="kumar@ga&mil.com";
		email[7]="prav@een.kumar@gmail.com";
		email[8]="klion!123@Gmail.com";
		email[9]="kumarg)obi@gmail.com";
		
		String regex="^[a-zA-Z0-9.-]+@[A-Za-z]+\\.[a-z]{2,3}$";
		
		Pattern pattern=Pattern.compile(regex);
		
		for(int i=0;i<10;i++){
		Matcher match =pattern.matcher(email[i]);
		
		if(match.matches())
			System.out.println("Given emailID is correct. ");
		else
			System.out.println("Please enter the valid emailId ");
		}
	}

}
