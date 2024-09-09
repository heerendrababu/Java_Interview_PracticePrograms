package com.interface1;

public class Test {

	public static void main(String[] args)
	{
        Aeroplane a=new Aeroplane();
                  a.canFly();
        Kite k= new Kite();
         k.canFly();
        
	}

}
 interface flyabble
{
 void canFly();	
}
class Kite implements flyabble
{
	public void canFly()
	{
		System.out.println("kites can fly");
	}
}
class Aeroplane implements flyabble
{
	public void canFly()
	{
		System.out.println("Aeroplane can fly");
	}
}