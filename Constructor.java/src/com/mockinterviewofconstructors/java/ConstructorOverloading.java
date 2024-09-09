package com.mockinterviewofconstructors.java;

public class ConstructorOverloading {

	public static void main(String[] args)
	{
      Person p1=new Person();
      Person p2=new Person(22,"babu");
      Person p3=new Person("heerendra");
      p1.display();
      p2.display();
      p3.display();
	}

}
class Person{
	String name;
	int age;
	Person()
	{
		
	}
	Person(int age,String name)
	{
	  this.age=age;
	  this.name=name;
	}
	Person(String name){
		this.name=name;
	}
	public void display()
{
		System.out.println(name);
		System.out.println(age);
}
}