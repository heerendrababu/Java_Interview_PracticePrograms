package com.method.java;

public class Final_methods_overloading {

	public static void main(String[] args)
	{
      c e=new c();
      e.m();
	}

}
class Example
{
	public final void m1()
	{
		System.out.println("1st method");
	}
	public final int m1(int i)
	{
		System.out.println("2nd method");
		return 10;
	}
}
class c extends Example
{
	public final void m() 
	{
		super.m1();
	}
}
