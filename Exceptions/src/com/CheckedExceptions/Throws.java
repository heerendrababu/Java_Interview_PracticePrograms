package com.CheckedExceptions;

import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;


public class Throws
{

	public static void main(String[] args) 
	{
     Test t=new Test();
   try {
		t.m();
	} catch (FileNotFoundException e) {
				e.printStackTrace();
	} 
	
	
     catch(Exception e)
     {
    	 e.printStackTrace();
    	 
     }
   System.out.println("Success");
	}
	

}
class Test{
	public void m()throws FileNotFoundException,IOException
	{
		//File f=new File("C:\\Users\\DELL\\Desktop");
		//FileReader fr=new FileReader(f);
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\JavaExample\\babu.txt");
		fw.write("welcome");
		fw.write('\n');
		fw.write("babu");
		//fw.write(100);
		fw.flush(); // To make sure every character write into file
		fw.close();

		
	}
}