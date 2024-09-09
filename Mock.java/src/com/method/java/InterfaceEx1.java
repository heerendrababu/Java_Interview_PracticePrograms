package com.method.java;

public class InterfaceEx1 {

	public static void main(String[] args)
	{
      
		
		B b1=new B();
	
      b1.m1();
      b1.m2();
      b1.m5();  
      System.out.println(i1.x);
     
	}
}
interface i1
{
	final int x=10;
	 public abstract void m1();
	
}
interface i2
{
    void m1();
    void m2();
}
class dog{
	public void m4()
	{
		System.out.println("norml method");
	}
}
 class B extends dog implements i1,i2
{
	public void m1() {
		System.out.println("hello");
		System.out.println(x);
	
	}
	public void m2()
	{
		System.out.println("m2");
	}
	public void m5()
	{
		m4();
	}
}

	
		
	
