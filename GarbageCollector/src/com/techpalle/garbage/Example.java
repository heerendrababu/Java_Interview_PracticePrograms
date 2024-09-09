package com.techpalle.garbage;

public class Example {

	public static void main(String[] args)
	{
        Test t = new Test();
          t.m();
          m1();
      	Test t1 = new Test();

	}
        public static void m1()
        {
        	Test t2 = new Test();
        	System.out.println("hii");
        	
        }
	}


class Test
{
	int x =10;
	public void  m()
	{
		System.out.println(x);
	}
}