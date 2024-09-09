package com.method.java;

public class Constructoroverloading {

	public static void main(String[] args)
	{
         Test01 t= new Test01("babu002");
         Test01 t1=new Test01();
         
         
         
	}

}
 class Test01
 {   
	 
	  public  Test01()
	 {
		System.out.println("no parameter constructor"); 
	 }
	 public  Test01(String name)
	 {
		 System.out.println("babu");
	 }
	 
 }