package com.CheckedExceptions;

public class CustomExc {

	public static void main(String[] args)
	{
		int age=18;
		
         if(age>0&&age>=18)
         {
        	 System.out.println("eligible");
         }
         else if(age>0&&age<=18)
         {
        	 System.out.println("Not eligible");
         }
         else
         try
         {
        	 throw new MyException("invalid");
         }
         catch(MyException e)
         {
        	 System.out.println("exception handled"); 
				
			
        }
         finally
         {
        	 System.out.println("hii");
         }    
	}
}
class MyException extends Exception
{
	public  MyException(String s )
	{
		System.out.println(s);
		//super(s);
	}
}