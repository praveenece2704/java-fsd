package APracticeL3;


class Throwkeyword  {
	
	public static double display(int n1,int n2)
	{
		if(n2==0)
		{
			throw new ArithmeticException("Divide by zero");
		}
		else 
		{
			return n1/n2;
		}
	}

}

class ThrowsKeyword
{
    public static double division(int n1,int n2) throws ArithmeticException 
    {
      	return n1/n2;
    }
}

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		super(str);
	}
}
class CustomException  
{  
       public static void validate (int age) throws InvalidAgeException{    
       if(age < 18)
       {   
        throw new InvalidAgeException("age is not valid to vote");    
       }  
       else 
       {   
        System.out.println("welcome to vote");   
       }   
     }    
}


public class KeyAndCustomExp
{
	public static void main(String[] args)
	{
		Throwkeyword k=new Throwkeyword();
		ThrowsKeyword k1=new ThrowsKeyword();
		CustomException k2=new CustomException();
		double d,d1;
		try
		{
			System.out.println(k.display(12,0));
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Program executed successfully");
		}
		
		
		try
		{
			System.out.println(k1.division(3, 0));
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Program executed successfully");
		}
		try  
        {  
            k2.validate(13);  
        }  
        catch (InvalidAgeException e)  
        {  
            System.out.println(e);  
        } 
		finally
		{
        System.out.println("rest of the code...");   
		}
	}
}
