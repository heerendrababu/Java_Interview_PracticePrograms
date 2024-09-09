package com.practice.one;

import java.util.Scanner;

public class NthFibonacciUsingMethods {

	public static void main(String[] args) 
	{
	   Scanner sc  = new Scanner(System.in);
	   System.out.println("Enter nth value");
	   int n = sc.nextInt();
//	   NthFibonacciUsingMethods x = new NthFibonacciUsingMethods(); if below method is static no need to create object
//	   x.getSeries(n);
	   getSeries(n); // [or] NthFibonacciUsingMethods.getSeries(n);

	}

 public  static void getSeries(int n)
 {
	 int x = 0;
	 int y = 1;
	 //int temp = 0;
	 System.out.println(x);
	 System.out.println(y);
	 for(int i=1;i<=n;i++)
	 {
		int temp = y+x; // if we declare temp above for loop we dont need to use datatype here or else use datatype with variable
		 x = y ;
		 y = temp;
		 System.out.print(temp+",");
	 }
	 
	 
 }

}

