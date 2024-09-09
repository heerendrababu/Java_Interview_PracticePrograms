package com.stars.pattern;

public class Alphabets_Three {

	public static void main(String[] args) 
	{
       int rows=4;
       char alp ='A';
       
       for(int i=1;i<=rows;i++)
       {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print(alp+" ");
    		   alp++;
    	   }
    	   System.out.println();
       }
	}
}
