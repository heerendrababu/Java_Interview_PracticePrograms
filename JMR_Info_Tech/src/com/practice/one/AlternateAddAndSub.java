package com.practice.one;

import java.util.Scanner;

public class AlternateAddAndSub {

	public static void main(String[] args)
	{
		// Taking array values at run time and add 2 to each value .
		 /*	int[] arr1 = new int[5];
		int[] arr2 = new int [arr1.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values of arr1");
			for(int i = 0 ;i<=arr1.length-1;i++)
		{
		  arr1[i] =	sc.nextInt();
		}
		System.out.println("after adding array elements");
		for(int i = 0 ;i<=arr1.length-1;i++)
		{
			arr2[i]= arr1[i]+2;
			
			System.out.print(arr2[i]+",");
		}*/
		
		int[] arr1= {1,2,3,4,5};
		int [] arr2 = new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]%2==0)
			{
				arr2[i] = arr1[i]-arr1[i];
			//	System.out.println(arr[i]+",");
			}
			else
			{
				arr2[i]= arr1[i]+arr1[i];
			  // System.out.println(arr1[i]+",");
	
			}
			System.out.print(arr2[i]+" ");
		}
		
		// Adding arr1 values into an empty array ie.,'arr2'
//		for(int i=0; i<=arr2.length-1;i++)
//		{
//			System.out.print(arr2[i]+" ");
//		}

	}

}
