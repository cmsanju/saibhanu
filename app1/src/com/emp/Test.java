package com.emp;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws PositiveSalException,NsalException
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter salary");
		
		double sal = sc.nextDouble();
		
		ValidateSal ve = new ValidateSal();
		
		ve.checkSal(sal);
	}

}
