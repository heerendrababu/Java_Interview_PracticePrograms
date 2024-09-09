package com.practice.one;

import java.util.Scanner;

public class CountDigitsUsingMethods {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	 long n = sc.nextLong();
	 long count =  getCountofDigits(n);
	 System.out.println(count);
	 
	 

	}
	
	public static long getCountofDigits(long n)
	{
		if(n==0)
		{
			return 1;
		}
		int count = 0;
		while(n!=0)
		{
			n = n/10;
			count++;
		}
		return count;
		
	}

}
