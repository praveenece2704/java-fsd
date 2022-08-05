package project;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BookingLogic {
	static int count = 0;
	static LinkedList<String> l=new LinkedList<String>();
	public static void BookingTicketsolt1(int time, LinkedList rowA,LinkedList rowB,LinkedList rowC,LinkedList rowD,
			LinkedList rowE,LinkedList rowF,LinkedList rowG,LinkedList rowH,LinkedList rowI)
	{
		LocalDateTime Date = LocalDateTime.now();  
	    DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    DateTimeFormatter Format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String formatDate = Date.format(Format);  
	    String formatTime = Date.format(Format1);
		double price=250;
		int flag=0;
		int flag1=0;
		int f=0;
		Scanner sc=new Scanner(System.in);
		if(time==1)
	    System.out.print("\nSeats available in row A are "+ rowA+"\nSeats available in row B are "+ rowB+"\nSeats available in row C are "+ rowC+"\n");
		else if(time==2)
		System.out.print("\nSeats available in row A are "+ rowD+"\nSeats available in row B are "+ rowE+"\nSeats available in row C are "+ rowF+"\n");
		else if(time==3)
		System.out.print("\nSeats available in row A are "+ rowG+"\nSeats available in row B are "+ rowH+"\nSeats available in row C are "+ rowI+"\n");
	    
	    if(time==1||time==2||time==3)
        {
	        	while(true){
	        	if(flag==1)break;
	        	System.out.println("\nPlease select a seat from Display");
	        	String seat=sc.next();
	        	if(rowA.contains(seat)||rowB.contains(seat)||rowC.contains(seat)||rowD.contains(seat)||
	        			rowE.contains(seat)||rowF.contains(seat)||rowG.contains(seat)||rowH.contains(seat)||rowI.contains(seat))
	        	{
	        	    if(time==1)l.add("Show timming is 10.30AM - 1.30PM ----> Seat number is "+seat);
	        	    else if(time==2)l.add("Show timming is 2.00AM - 5.00PM ---->Seat number is "+seat);
	        	    else l.add("Show timming is 9.00PM - 12.00PM ---->Seat number is "+seat);
	        		count=count+1;
        			while(flag1==0)
        			{
	        		System.out.println("Do you want to Book another Ticket Please Press Yes or No");
	        		String c=sc.next();
	        		if(c.equalsIgnoreCase("Yes"))
	        		{
	        			flag1=1;
	        			if(rowA.contains(seat)||rowB.contains(seat)||rowC.contains(seat)||rowD.contains(seat)
	        					||rowE.contains(seat)||rowF.contains(seat)||rowG.contains(seat)||rowH.contains(seat)||rowI.contains(seat))
	        			{
	        				flag=1;
	        				for(int i=1;i<=15;i++)
	            			{
	        					if(time==1)
	        					{
		            				if(seat.equalsIgnoreCase("A"+i))rowA.remove("A"+i);
		            			    if(seat.equalsIgnoreCase("B"+i))rowB.remove("B"+i);
		            			    if(seat.equalsIgnoreCase("C"+i))rowC.remove("C"+i);
	        					}
	            			    else if(time==2)
	            			    {
		            			    if(seat.equalsIgnoreCase("A"+i))rowD.remove("A"+i);
		            			    if(seat.equalsIgnoreCase("B"+i))rowE.remove("B"+i);
		            			    if(seat.equalsIgnoreCase("C"+i))rowF.remove("C"+i);
	            			    }
	            			    else if(time==3)
	            			    {
	            			    	if(seat.equalsIgnoreCase("A"+i))rowG.remove("A"+i);
		            			    if(seat.equalsIgnoreCase("B"+i))rowH.remove("B"+i);
		            			    if(seat.equalsIgnoreCase("C"+i))rowI.remove("C"+i);
	            			    }
	            			}
	        			try{
	        		    	gettheshowtime(rowA,rowB,rowC,rowD,rowE,rowF,rowG,rowH,rowI);
	        		    	}
	        		    	catch(Exception e)
	        		    	{
	        		    		System.out.println(e);
	        		    	}
	        			}
	        			else
    	        			System.out.println("Please select the available seat from display slot");
	        		}
	        		else if(c.equalsIgnoreCase("No"))
	        		{
	        			flag1=1;
	        			System.out.println("Woohoo!!!... Ticket booked successfully");
	        			Iterator<String> it=l.iterator();
	        			while(it.hasNext())System.out.println(it.next());
	        			System.out.println("Ticket Generated Date: "+formatDate+"\nTicket Generated Time: "+formatTime);
	        			System.out.println("Number of seats you booked is "+count);
	        			System.out.println("=================================================");
	        			System.out.println("Total amount you have to paid is "+(count*price));
	        			System.out.println("=================================================");
	        			flag=1;
	        			break;
	        		}
        			}
	        	}
	        	else
        			System.out.println("Seat is Not available, Please select the another seat");  	
	        }
        }
	else{
    	System.out.println("No show at this time Please choose available time slot");
    	try{
    	gettheshowtime(rowA,rowB,rowC,rowD,rowE,rowF,rowG,rowH,rowI);
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
	    }
	}
        
	public static void main(String[] args)
	{
		System.out.println("\n**************************************\n");
	    System.out.println("\tWelcome to UniverseThreater \n");
	    System.out.println("**************************************");
		logininstruction("User");
	}
	public static void logininstruction(String info1)
	{                                                                        //Default username =  Praveen
		String adminPass=new String("Mars@123");                             //Default password =  Mars@123		                                                                     //Default username =  Praveen
		Scanner sc=new Scanner(System.in);
		BookingLogic md=new BookingLogic();
		LinkedList<String> rowA = new LinkedList<String>();                  
		LinkedList<String> rowB = new LinkedList<String>();
		LinkedList<String> rowC = new LinkedList<String>();
		//Three rows for time slot2
		LinkedList<String> rowD = new LinkedList<String>();
		LinkedList<String> rowE = new LinkedList<String>();
		LinkedList<String> rowF = new LinkedList<String>();
		//Three rows for time slot3
		LinkedList<String> rowG = new LinkedList<String>();
		LinkedList<String> rowH = new LinkedList<String>();
		LinkedList<String> rowI = new LinkedList<String>();
		//Default 15 seats are available in each rows
	    for(int i=1;i<=15;i++)
			{
			rowA.add("A"+i);
			rowB.add("B"+i);
			rowC.add("C"+i);
			rowD.add("A"+i);
			rowE.add("B"+i);
			rowF.add("C"+i);
			rowG.add("A"+i);
			rowH.add("B"+i);
			rowI.add("C"+i);
			}
		Scanner sc1=new Scanner(System.in);
		int flag=0;
		int flag1=0;
		int flag2=0;
		if(info1.equalsIgnoreCase("User"))
		{
			System.out.println("......Proceed Login......");
			while(flag1==0)
			{
			System.out.print("Please enter the username : ");
			String username=sc1.next();
			System.out.print("Please enter the password : ");
			String password=sc1.next();
			if(username.equals("Praveen")&&password.equals("Mars@123"))
			{
				flag1=1;
			System.out.println("Do you want to update your password or Proceed Ticket booking? ");
			while(flag2==0)
			{
			System.out.println("Please Press U for update B for booking (U/B)");
			String info2=sc1.next();
			switch(info2)
			{
			case "u" : case "U":
			{
				flag2=1;
				while(flag==0)
				{
				System.out.println("========Please enter your old Password=========");
				String info3=sc1.next();
				if(info3.equals("Mars@123"))
				{
					System.out.println("Password Matches............");
					while(true){
				    System.out.println("*********Please enter New Password*********");
					String info5=sc1.next();
					if(!(info5.equals("Mars@123")))
					{
						System.out.println("Woohoo....!!! Password Updated successfully... Thank you...!!!");
						flag=1;
						break;
					}else
						System.out.println("Oops....Password is same as Old Password please enter the New Password ");
					}
				}else
					System.out.println("Oops....Password doesn't matches please enter the correct password");
				}
			}
			break;
			case "b": case "B":
			{
				flag2=1;
				try{
					System.out.println("......Welcome to Booking page...");
					System.out.println("......Proceed Movie Ticket Booking.... ");
			        md.gettheshowtime(rowA,rowB,rowC,rowD,rowE,rowF,rowG,rowH,rowI);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			break;
			}
			}
			}
			else
				System.out.println("Please enter the correct password");
		}
			
	}
	}
    
	public static void gettheshowtime(LinkedList rowA,LinkedList rowB,LinkedList rowC,
			LinkedList rowD,LinkedList rowE,LinkedList rowF,LinkedList rowG,LinkedList rowH,LinkedList rowI)throws Exception
	{
		int flag=0;
		while(flag==0)
		{
		    Scanner scan=new Scanner(System.in);
			System.out.println("\nShowTimings Available are....Please select show time...Happy Booking!!!");
		    System.out.println("\n\t1. 10.30AM - 1.30PM");
		    System.out.println("\t2. 2.00PM - 5.00PM");
		    System.out.println("\t3. 9.00PM - 12.00PM");
		    System.out.println("\nPlease press any one of the time slot (1/2/3)");
		    try{
		    int time = scan.nextInt();
		    if(time==1){
		    	flag=1;
		    	System.out.println("You are selected the show time is 10.30AM - 1.30PM");
		    	BookingTicketsolt1(time,rowA,rowB,rowC,rowD,rowE,rowF,rowG,rowH,rowI);
		    }
		    else if(time==2)
		    {
		    	flag=1;
		    	System.out.println("You are selected the show time is 2.00AM - 5.00PM");
		    	BookingTicketsolt1(time,rowA,rowB,rowC,rowD,rowE,rowF,rowG,rowH,rowI);
		    }
		    else if(time==3)
		    {
		    	flag=1;
		    	System.out.println("You are selected the show time is 9.00AM - 12.00PM");
		    	BookingTicketsolt1(time,rowA,rowB,rowC,rowD,rowE,rowF,rowG,rowH,rowI);
		    }
		    else
		    {
		    	System.out.println("Please Select the given show time");
		    }
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Please enter the (1/2/3) time slot ");
		    }
		}
		}
}
