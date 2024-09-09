package com.practice.one;

import java.util.Scanner;

public class AddingIntoEmptyArray {

	public static void main(String[] args) 
	{
		/* int[] arr1= {10,20,30,40,50};
		int[] arr2 = {10,20,30,40,50};
		int [] arr3 = new int[arr1.length];
		
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]= arr1[i]+arr2[i];
			
			System.out.print(arr3[i]+",");
		}*/
		
		// Giving arrays at runtime
	
		int[] arr1 = new int[5];
		  int[] arr2 = new int[5];
		 int[] arr3 = new int[arr1.length];
		 
	    Scanner sc = new Scanner(System.in);// arr1
	    System.out.print("enter values of arr1");
	    for(int i=0 ;i<arr1.length;i++)
	    {
	    	arr1[i]=sc.nextInt();
	    }
	  
      
	   // Scanner sc1 = new Scanner(System.in);//
	    System.out.print("enter values of arr2");
	    for(int i=0;i<arr2.length;i++)
	    {
	    arr2[i]	= sc.nextInt();
	    }
	   
	    for(int i=0;i<=arr1.length-1;i++)
	    {
	    	arr3[i] = arr1[i]+arr2[i];
	    	System.out.print(arr3[i]+",");
	    }
	}

}
