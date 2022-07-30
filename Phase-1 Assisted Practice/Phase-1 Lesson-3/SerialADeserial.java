package APracticeL3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Dog implements java.io.Serializable
{
	private String dogName;
	private String dogColor;
	private int no_of_dogs;
	private double dogHeight;
	private String dogEyeColor;
	
	public Dog(String dogName,String dogColor,int no_of_dogs,double dogHeight,String dogEyeColor)
	{
		this.dogName=dogName;
		this.dogColor=dogColor;
		this.no_of_dogs=no_of_dogs;
		this.dogEyeColor=dogEyeColor;
		this.dogHeight=dogHeight;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getDogColor() {
		return dogColor;
	}

	public void setDogColor(String dogColor) {
		this.dogColor = dogColor;
	}

	public int getNo_of_dogs() {
		return no_of_dogs;
	}

	public void setNo_of_dogs(int no_of_dogs) {
		this.no_of_dogs = no_of_dogs;
	}

	public double getDogHeight() {
		return dogHeight;
	}

	public void setDogHeight(float dogHeight) {

		this.dogHeight = dogHeight;
	}

	public String getDogEyeColor() {
		return dogEyeColor;
	}

	public void setDogEyeColor(String dogEyeColor) {
		this.dogEyeColor = dogEyeColor;
	}
	
	
}

public class SerialADeserial {

	public static void main(String[] args) throws IOException {
		
		Dog d=new Dog("Jue","Brown",4,10,"CatEye");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		
		try{
		fos=new FileOutputStream("Serialization.ser");
		oos=new ObjectOutputStream(fos);
		    
		    oos.writeObject(d);
		    System.out.println("serialization is done");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			fos.close();
			oos.close();
			
		}
		
		Dog d1 = null;
		try{
		FileInputStream fis=new FileInputStream("Serialization.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		d1=(Dog) ois.readObject();
		ois.close();
		fis.close();
		
		}
		catch(IOException e1)
		{
			System.out.println(e1);
		}
		catch(ClassNotFoundException e2)
		{
			System.out.println(e2);
		}
		
		
		System.out.println("Dog name is : "+d1.getDogName());
		System.out.println("Dog Color is : "+d1.getDogColor());
		System.out.println("Dog count is : "+d1.getNo_of_dogs());
		System.out.println("Dog Height is : "+d1.getDogHeight());
		System.out.println("Dog Eyecolor is : "+d1.getDogEyeColor());
	
		
	}

}
