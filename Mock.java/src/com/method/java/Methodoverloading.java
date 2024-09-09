package com.method.java;

public class Methodoverloading {

	public static void main(String[] args)
	{
		//Tests t= new Tests();
		//String k=t.m("k");
		//System.out.println(k);
		child22 c=new child22();
		c.m();
	}

}
class Tests{
	public void m()
	{
		System.out.println("hii");
	}
	
	public void m(int i)
	{
     System.out.println("babu");
	}
	public String m(String name)
	{
		return name;
	}
	
}
class child22 extends Tests
{
	//public int m()// here it is trying to override but showing error because return type is not same
	{
		//return 10;
	}
}