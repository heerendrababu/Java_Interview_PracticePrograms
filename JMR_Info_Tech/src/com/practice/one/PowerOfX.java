package com.practice.one;

public class PowerOfX {

	public static void main(String[] args)
	{
		int base = 2;
		int exponent = 2;
		int result = 1;
		
	   for(int i=1;i<=exponent;i++)
	   {
		   result = result * base;
	   }
	   System.out.println(result);
	}

}
