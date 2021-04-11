package com.test;

public class Exp1 {
	
	public static void main(String[] args) {
		
		double x = 2000;
		double y = 3000;
		
		String val = String.valueOf(x);
		String val1 = String.valueOf(y);
		
		System.out.println(x+y);
		
		System.out.println(val+val1);
		
		
		
		int i = 10;
		
		double d =334.44;
		
		float f = 23.34f;
		
		Float ff = new Float(f);
		
		Double dd = new Double(d);
		
		Integer ii = new Integer(i);
		
		
		
		//auto unboxing
		
		Integer ix = new Integer(200);
		
		int ij = ix;
		
		Double dx = new Double(234.48);
		
		double ddx = dx;
		
	}

}
