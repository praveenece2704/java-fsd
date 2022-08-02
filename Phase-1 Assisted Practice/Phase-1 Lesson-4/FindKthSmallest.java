package APracticeL4;

import java.util.Scanner;

public class FindKthSmallest 
{  
  
	public void sortArr(int arr[])  
	{  
	int size = arr.length;  
	  
	for(int i = 0; i < size; i++)  
	{  
		int temp = i;  
			for(int j = i + 1; j < size; j++)  
			{  
				if(arr[temp] > arr[j])  
				{  
				temp = j;  
				}  
			}
	
		if(temp != i)  
		{  
			int t = arr[i];  
			arr[i] = arr[temp];  
			arr[temp] = t;   
		}  
	}  
	}  
	public int findKthSmallest(int arr[], int k)  
	{
	sortArr(arr); 
//	for(int i=0;i<arr.length;i++)
//	{
//		System.out.print(arr[i]);
//	}
	return arr[k - 1];  
	}  
	  
  
 
public static void main(String argvs[])  
{  
    FindKthSmallest obj = new FindKthSmallest();  
  
    int size;  
    int k;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    size=sc.nextInt();
    System.out.println("Enter the K value ");
    k=sc.nextInt();
    
    int arr[] =new int[size];  
    for(int i = 0; i < size; i++)  
    {  
      arr[i]=sc.nextInt();  
    }  
  
    System.out.println("For the array: ");  
    for(int i = 0; i < size; i++)  
    {  
    System.out.print(arr[i] + " ");  
    }  
  
	int ele = obj.findKthSmallest(arr, k);  
	  
	System.out.println();  
	System.out.println("The " + k + "rd smallest element of the array is: " + ele);  
	}  
}