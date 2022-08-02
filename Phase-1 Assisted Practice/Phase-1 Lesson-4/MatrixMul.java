package APracticeL4;

import java.util.Scanner;

public class MatrixMul
{  
    public static void main(String args[])
    {  

    	int n = 0;
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
    	int[][] arr1=new int[10][10];
    	int[][] arr2=new int[10][10];
    	
    	
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			arr1[i][j]=sc.nextInt();
    		}
    	}
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			arr2[i][j]=sc.nextInt();
    		}
    	}
	 
        int c[][]=new int[3][3];
    

      for(int i=0;i<n;i++)
      {    
         for(int j=0;j<n;j++)
         {    
            c[i][j]=0;
            for(int k=0;k<n;k++)      
            {      
              c[i][j]+=arr1[i][k]*arr2[k][j];      
            }  
          System.out.print(c[i][j]+" ");    
         } 
       System.out.println();   
      }    
   }
}  