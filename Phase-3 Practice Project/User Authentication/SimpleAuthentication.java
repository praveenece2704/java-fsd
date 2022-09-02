package com.example.Mapping;

public class SimpleAuthentication {
	
	public  boolean validate(String name,String password)
	{
		if(name.equalsIgnoreCase("praveen")&&(password.equalsIgnoreCase("praveen@123")))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
    public boolean validatename(String str) 
    {
		    return str.matches("[A-Za-z0-9]{9}");
	}
    public boolean validatepassword(String str) 
    {
		    return str.matches("[A-Za-z[@#$]0-9]{11}");
	}

}
