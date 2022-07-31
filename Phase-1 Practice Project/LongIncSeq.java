
package Practice;

import java.util.Scanner;

public class LongIncSeq {
	
	static int sequence(int a[], int n)
	{
		int temp[] = new int[n];
		int i,j;
		int m = 0;
		
		for (i = 0; i < n; i++) // we are going the initialize the temp variables value is 1
		{
			temp[i] = 1;
		}
		
		for (i = 1; i < n; i++)
		{
	       for (j = 0; j < i; j++)
	       {
				if (a[i] > a[j] && temp[i] < temp[j] + 1)
				{
					temp[i] = temp[j] + 1;
				}
	       }
		}
		//finally return the maximum value in the temp array
		for (i = 0; i < n; i++)
		{
			if (m < temp[i])
			{
				m= temp[i];
			}
		}

		return m;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n;
		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		long result=sequence(arr, n);// type casting
		
		System.out.println("Length of the Longest Increasing sequence is : " + result );

	}

}