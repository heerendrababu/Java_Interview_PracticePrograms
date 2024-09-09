package com.CheckedExceptions;

public class Demo {

	public static void main(String[] args)
	{
       int arr[] = {12,32,4,3,4};
       try
       {   
    	   System.out.println(arr[1]);
    	int r=   arr[7]= arr[1]/0;
    	   System.out.println(arr[8]);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println("handled");
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println("exception handled");
       }
         
	}

}
