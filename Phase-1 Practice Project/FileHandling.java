package Practice;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		
		DataInputStream dos=new DataInputStream(System.in);
		
			FileOutputStream fi=new FileOutputStream("Testfile.txt",true);
			BufferedOutputStream bu=new BufferedOutputStream(fi);
			
            FileOutputStream file=new FileOutputStream("Newfile.txt");
			BufferedOutputStream buf=new BufferedOutputStream(file);
			
			char ch;
			//To write the data to the Testfile.txt file 
			while((ch=(char)dos.read())!='@')
			{
				fi.write(ch);
			}
			fi.close();	
			
			//To read the data from the Testfile.txt file and show in the Newfile.txt file
			FileInputStream f=new FileInputStream("Testfile.txt");
			
			int a;
			while((a=(int)f.read())!=-1)
			{
				file.write((char)a);
				System.out.print((char)a);          //TO show the data in the console
				
			}			
	}
}
