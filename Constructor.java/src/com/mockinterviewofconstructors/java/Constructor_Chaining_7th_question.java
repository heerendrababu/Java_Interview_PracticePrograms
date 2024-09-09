package com.mockinterviewofconstructors.java;

public class Constructor_Chaining_7th_question
{ 
	B b1=new B(10);
}
 class A{
	 public A()
	 { 
		 
		 System.out.println("here super will added by compiler");
	 }
	 
 }
 class B extends A
 {
	 public B(int x)
	 {
		 
		 //System.out.println("here super will call parent class constructor");
		 System.out.println(x);
	 }
 
  
}