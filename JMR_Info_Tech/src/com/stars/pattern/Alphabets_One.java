package com.stars.pattern;

public class Alphabets_One {

	public static void main(String[] args)
	{
      char[] ch = {'A','B','C','D'};
      
      for(int i=0;i<=ch.length-1;i++)
      {
    	  for(int j=0;j<=i;j++)
    	  {
    		  System.out.print(ch[i]);
    	  }
    	  System.out.println();
      }
	}

}
