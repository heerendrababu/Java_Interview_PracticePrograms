package com.method.java;

public class Methodoverriding {

	public static void main(String[] args)
	{ 
		child c=new child();
		c.m1();
		c.m2();

	}

}
class Method_overriding
{
   public void m1()
   {
	   System.out.println("parent class method");
   }
   public void m2() {
	   System.out.println("parenet another method");
   }
}
class child extends Method_overriding
{
	int x=10;
	public void m1()
	{
		System.out.println("child class method");
		System.out.println(x);
	}
	public void m2()
	{
		System.out.println("child class another method");
	}
	
}