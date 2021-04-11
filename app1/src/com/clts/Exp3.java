package com.clts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exp3 {
	
	public static void main(String[] args) {
		
		Set hs = new HashSet();
		
		hs.add(12);
		hs.add('A');
		hs.add("java");
		hs.add(12);
		hs.add("java");
		hs.add(23.67);
		hs.add(45.34f);
		
		System.out.println(hs);
		
		
		Set lhs = new LinkedHashSet();
		
		lhs.add(12);
		lhs.add('A');
		lhs.add("java");
		lhs.add(12);
		lhs.add("java");
		lhs.add(23.67);
		lhs.add(45.34f);
		
		System.out.println(lhs);
		
	}

}
