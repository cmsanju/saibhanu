package com.clts;

import java.util.Stack;

public class Exp2 {
	
	public static void main(String[] args) {
		
		Stack list = new Stack();
		
		list.add(12);
		list.add('A');
		list.add("java");
		list.add(12);
		list.add("java");
		list.add(23.67);
		list.add(45.34f);
		
		System.out.println(list);
		
		System.out.println(list.peek());
		
		list.push("venkatesh");
		
		System.out.println(list);
		
		System.out.println(list.pop());
		
		System.out.println(list);
		
		System.out.println(list.search(1200));
		
		System.out.println(list.empty());
		
	}

}
