package com.exp;

import java.util.Scanner;

public class Test {
		
	public static void main(String[] args) //throws ValidVoterException,InvalidVoterException
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age");
		
		int age = sc.nextInt();
		
		Validater v = new Validater();
		
		try {
		
		v.checkAge(age);
		
		}
		catch(ValidVoterException ve)
		{
			System.out.println("valid agae");
		}
		catch(InvalidVoterException ie)
		{
			System.out.println("invalid age");
		}
		
		
	}
}
