package com.constructor;

public class Test5 {

	public static void main(String[] args) {
		Persons p=new Persons();
		
			p.display();
		

	}

}
class Persons
{
	String name;
	int id;
	{
	name ="abc";
	id= 1;
	
	}
	public void display()
	{
		
		System.out.println(name);
		System.out.println(id);
	}
}