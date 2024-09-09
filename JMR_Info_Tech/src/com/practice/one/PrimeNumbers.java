package com.practice.one;

public class PrimeNumbers {

	public static void main(String[] args)
	{
        int a = 0; // it is used to count how many prime numbers are occured.

        for(int i =1 ;i<=20;i++) // prime numbers between 5 and 20
        {
         	int count =0;
        	for(int j=1;j<=i;j++) // if we put j = 0 it will show 'Arithmetic Exception'
        	{
        		if(i%j==0)
        		{
        		   count++;// it is used to check count which is need to be '2' to be prime or else it is not prime
        		}
           }
        if(count == 2)
        {
        	System.out.print(i+",");
        	a++;
        }	
      }
        System.out.println();
        System.out.println("Total no.of prime numbers are :"+a);
	}

}
