package com.exceptions.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EscapeSequence {

	public static void main(String[] args) {
		System.out.println("Heerendra\tbabu");
		File f=new File("C:\\Users\\DELL\\Desktop");
		try
		{
			FileReader fr=new FileReader(f);
		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
System.out.println("Hello");
	}

}
