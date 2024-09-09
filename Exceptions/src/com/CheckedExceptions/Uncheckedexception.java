package com.CheckedExceptions;

public class Uncheckedexception {

	public static void main(String[] args)
	{
		int[] arr= {0,1,2,};
		//System.out.println(arr[3]);
		try
		{
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception handled");
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[2]);
     
	}

}
