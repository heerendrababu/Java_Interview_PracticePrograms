package com.Practice.questions;

public class Inheritance {

	public static void main(String[] args) {
		B b=new B();
		b.m2();
	

	}

}
class Aa
{
   int x=10;
	public void m1()
	{
		System.out.println(x);
		System.out.println("HAi");
	}
}
class B extends Aa
{
	int y=200;
	public void m2() 
	{

	m1();
    System.out.println(y);
    System.out.println("Hello");
	}
}