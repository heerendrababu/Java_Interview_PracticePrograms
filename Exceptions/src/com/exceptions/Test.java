package com.exceptions;

public class Test {

	public static void main(String[] args) {
   
    System.out.println("welcome");
    int[] arr= {1,2,3};
    int i=10;
    int j=20;
    
  
    try {
    	
    	System.out.println(j);
    	System.out.println(j/0);
    	
    	 j=20/0;    	
    }
    catch(ArithmeticException e)
    {
    	System.out.println("hhhh");
    }
    finally
    {
    	System.out.println("def execute");
    	try {
    	System.out.println(arr[6]);
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("handled");
    	}
    	
    	System.out.println("finally block printing statement");
    }
    
	//System.out.println(j);

    
	}
	
	
		
	
}
   
   
	
    

