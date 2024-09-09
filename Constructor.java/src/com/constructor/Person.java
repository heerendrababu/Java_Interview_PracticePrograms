package com.constructor;

public class Person {
	String name;
	long Mobileno;
	String BloodGroup;
	public Person(String s,long m,String b)
	{
		name=s;
		Mobileno=m;
		BloodGroup=b;
	}
    public void display()
   {
    	System.out.println("name: "+name);
    	System.out.println("Mobileno: "+Mobileno);
    	System.out.println("BloodGroup "+BloodGroup);
   
	}
	

}
