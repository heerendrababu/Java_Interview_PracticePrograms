package com.CheckedExceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checkedexample {

	public static void main(String[] args)//throws FileNotFoundException
	{
    MyClass m=new MyClass();
   try {
    	m.m1();
    }
    catch(FileNotFoundException e)
    {
    	e.printStackTrace();
    }
    System.out.println(m.x);
	}

}
class MyClass{
	public void m1()throws FileNotFoundException
	{
		FileReader fr=new FileReader("c:kkkj\\skdjf\\");
	}
	int x=10;
}
