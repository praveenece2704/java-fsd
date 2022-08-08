package Practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LogicImplementation {
	private void searchingfile() {
		//To get the file from the user for searching
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file for searching");
		String filename=sc.next();
		File file=new File("C:\\Users\\Raj\\Desktop\\Demo\\");
		//display operation
		int flag=0;
		File filenames[]=file.listFiles();
		for(File f:filenames) {
			if(f.getName().equals(filename)) {
				flag=1;
				break;
			}
			else 
				flag=0;
		}
		
		if(flag==1) 
			System.out.println("File is found");
		
		else 
			System.out.println("File is not found");	
	}


	private void deletingfile() {
		//File path
		String path="C:\\Users\\Raj\\Desktop\\Demo\\";
		//To get the file from the user for deleting
		Scanner s=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename=s.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		f.delete();
		System.out.println("File is deleted");
	}

	private void fileadding() throws IOException {
		//File path
		String path="C:\\Users\\Raj\\Desktop\\Demo\\";
		//To get the file from the user for adding
		Scanner s=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename=s.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//create a new file
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("File not created");
		}
		else {
			System.out.println("File created");
		}
	}

	public void operation() throws IOException
	{
		Scanner sc = new Scanner(System.in);
        int flag1=0;
		
		while(flag1==0)
		{	
			System.out.println("To add file Press ---> (1)");
			System.out.println("Delete File Press ---> (2)");
			System.out.println("Search a file Press ---> (3)");
			System.out.println("Return to Main Menu Press ---> (4)");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:	fileadding(); 
						break;
				case 2:	deletingfile();
						break;
				case 3:	searchingfile();
						break;
				case 4:	flag1=1;
					    break;
			}
		
		}
	}
}

