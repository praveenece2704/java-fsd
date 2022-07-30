package AssistedPrograms;

import java.util.*;
public class ArrayImplementation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[10];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int a:arr)
	{
		System.out.println(a);
	}
	
	int[][] arr1=new int[2][2];
	
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr1[i].length;j++)
		{
			arr1[i][j]=sc.nextInt();
		}
	}

	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr1[i].length;j++)
		{
			System.out.println(arr1[i][j]);
		}
	}

	}

}
