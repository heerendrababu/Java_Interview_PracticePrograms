package com.CheckedExceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checkedexception2 {

	public static void main(String[] args)
	{
      File f=new File("C:\\Users\\DELL\\Desktop");
      try {
    	  FileReader fr=new FileReader(f);
      }
      catch(FileNotFoundException e)
      {
    	  e.printStackTrace();
    	  System.out.println('h');
    	  System.out.println("hello");
      }
	}

}
