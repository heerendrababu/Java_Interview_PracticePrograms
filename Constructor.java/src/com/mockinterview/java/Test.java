package com.mockinterview.java;

public class Test {

	public static void main(String[] args)
	{
		Person p=new Person(1,"babu");
		System.out.println(p.no);
		System.out.println(p.name);
		Person p1=new Person();

	}

}
 class Person
 {
	 int no;
	 String name;
	 Person()
	 {
		System.out.println("thi is  a constructor"); 
	 }
	 Person(int no,String name)
	 {
		 this.no=no;
		 this.name=name;
	 }
	 
 }