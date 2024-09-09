package com.CheckedExceptions;

public class User_DefinedEception {
	public static void enterAge(int x)
	{
		if(x<18)
		{
			throw new ArithmeticException("Not eligible for vote.....");
		}
		else
		{
			System.out.println("You areligible for vote.....");
		}
	}

	public static void main(String[] args) {
		User_DefinedEception.enterAge(2);

	}

}
