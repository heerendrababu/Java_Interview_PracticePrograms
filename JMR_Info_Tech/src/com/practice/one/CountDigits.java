package com.practice.one;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number");
//	     long n = sc.nextLong();
//	     
//	     int count =0;
//	     
////	     if(n == 0)
////	     {
////	        System.out.println("enter value more than 1");
////	     }
//	      
//	     while(n!=0)
//	     {
//	    	 n = n/10; 
//// [1]The above will give quotient value .[2] if it gets fraction value then it will remove fraction part and only return int value. 
//	    	 count++;
//	     }
//	     System.out.println("count of digits: "+count);
		int num = 343402;
		int count =0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Total no.of digits"+count);

	}

}
