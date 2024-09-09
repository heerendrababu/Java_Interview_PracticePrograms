package com.practice.one;

import java.util.Scanner;

public class NthFibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many fibonacci numbers you want");
        int n = sc.nextInt();
        
        int x = 0;
        int y = 1;
        int temp = 0;
        System.out.println(x);
        System.out.println(y);
        
        for(int i= 1;i<=n;i++)
        {
        	temp = y+x;
        	  x = y;
        	  y = temp;
            
             System.out.print(temp+",");
        }
       // System.out.print(temp+",");
        
	}

}
