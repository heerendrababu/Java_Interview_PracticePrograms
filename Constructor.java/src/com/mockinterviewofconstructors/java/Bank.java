package com.mockinterviewofconstructors.java;

 
  
  public class Bank
  {
  String name;
  long accno;
  String ifsc;
  private Bank(String name,long accno,String ifsc)
   {
	  this.name=name;
	  this.accno=accno;
	  this.ifsc=ifsc;
  }
  public void display()
  {
	  System.out.println(name);
	  System.out.println(accno);
	  System.out.println(ifsc);
	  
  }
  public static void main(String[] args)
  {
	  Bank b1=new Bank("babu",365213222365L,"2154g55");
	  b1.display();
  }
  
 }
 