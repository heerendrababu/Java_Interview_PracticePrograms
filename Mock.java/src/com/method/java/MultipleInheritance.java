package com.method.java;

public class MultipleInheritance {

	public static void main(String[] args) {
      childx c=new childx();
      c.m1();
	}

}
class T1
{
	public void m1()
	{
		System.out.println("hii");
	}
	
}
class T2 
{
	public void m1()
	{
		System.out.println("hello");
	}
}
class childx extends T1
{
	public void m()
	{
		m1();
		//m2();
	}
}
