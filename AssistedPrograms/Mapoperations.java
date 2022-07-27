package AssistedPrograms;

import java.util.*;
public class Mapoperations {
	
	public static void main(String[] args)
	{
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "praveen");
		m.put(2, "Kumari");
		m.put(3, "Jai");
		m.put(4, "Mike");
		
		for (Map.Entry<Integer,String> val :m.entrySet()) {
 
           System.out.print(val.getKey() + " "+val.getValue());
           System.out.println();
		}
           LinkedHashMap<Integer,String> m1=new LinkedHashMap<Integer,String>();
           
           m1.put(1, "praveen");
   		   m1.put(2, "Kumari");
   		   m1.put(3, "Jai");
   		   m1.put(4, "Mike");
   		
   		for (Map.Entry<Integer,String> va :m1.entrySet()) {
    
              System.out.print(va.getKey() + " "+va.getValue());
              System.out.println();
       }
   		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(1, "praveen");
		t.put(2, "Kumari");
		t.put(3, "Jai");
		t.put(4, "Mike");
		
		for (Map.Entry<Integer,String> ta :t.entrySet()) {
 
           System.out.print(ta.getKey() + " "+ta.getValue());
           System.out.println();
		}
	}


}
