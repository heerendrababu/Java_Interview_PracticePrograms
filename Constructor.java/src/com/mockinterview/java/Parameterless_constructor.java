package com.mockinterview.java;
class Test33{
	int num1;
	int num2;
	float f;
	Test33(){
		num1= 5;
		num2= 6;
		System.out.println("this is parameterless constructor");
		System.out.println(num1);
		System.out.println(num2);
	}
	Test33(float f)
	{
		this.f= f;
	}
}














public class Parameterless_constructor {

	public static void main(String[] args)
	{
       Test33 t=new Test33(12.3f);
       System.out.println(t.f);
       Test33 t1=new Test33();

       
	}

}
