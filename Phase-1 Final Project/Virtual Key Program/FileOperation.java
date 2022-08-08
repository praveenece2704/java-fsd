package Practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {

	private static void sortfunction() {
		File file=new File("C:\\Users\\Raj\\Desktop\\Demo\\");
		//files are already in the sorted order so only we are going to display the files
		//store the files in the array by using for loop we display the file
		File filenames[]=file.listFiles();
		for(File f:filenames) {
			System.out.println(f.getName());
		}

	}
public static void main(String[] args) throws IOException {
	
LogicImplementation logic = new LogicImplementation();
Scanner sc = new Scanner(System.in);
int flag=0;

	while(flag==0)
	{
		System.out.println("To retrive files in ascending order Press ---> (1)");
		System.out.println("Business level Operation Press ---> (2)");
		System.out.println("Close the application Press ---> (3)");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:	sortfunction(); // function for sorting the files in ascending order 
				break;
		case 2:	logic.operation();
				System.out.println("Returned to Main Menu");
				break;
		case 3: flag=1; 
			    break;
		}
	}
System.out.println("(======Thank you=======)");
	}
	
}

