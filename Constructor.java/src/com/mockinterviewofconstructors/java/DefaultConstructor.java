package com.mockinterviewofconstructors.java;           //Note: it is default constructor so we need not to initlize
                                                       //objects ,so for displaying data we can initlize data in 
public class DefaultConstructor {                     //constructor itself or else it will show default values

	public static void main(String[] args)                              
	{                                                                  
      person2 p=new person2();                                         
      //p.display();
      System.out.println(p.name);
      System.out.println(p.age);
	}

}
class person2{
	String name;
	int age;
	person2()
	{
		
	}
	/*public void display()
	
	{
		System.out.println(name);
		System.out.println(age);
	}*/
}
