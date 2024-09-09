package com.CheckedExceptions;

public class Throw1 {

	public static void main(String[] args)//throws ArithmeticException
	{
		//System.out.println("hi");
		int i=10;
		try {
			System.out.println(i/0);
		    // throw new ArithmeticException();      
		}
		catch(ArithmeticException e) 
		{
			//throw e;
			e.printStackTrace();
     //System.out.println("hello");
     
	}
		/*try {
			System.out.println(j[0]);
			System.out.println(j[3]);
			int o=i/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
		}
		catch(ArithmeticException e)
		{
			
		}*/
 // System.out.println("good");
}
}
