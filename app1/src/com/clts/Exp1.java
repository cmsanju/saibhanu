package com.clts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exp1 {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		int[] ar = {12,34,56,90};
		
		// single variable i need to store
		
		//List list = new ArrayList();
		List list = new LinkedList();
		
		//ArrayList al = new ArrayList();
		//LinkedList ll = new LinkedList();
		
		list.add(12);
		list.add('A');
		list.add("java");
		list.add(12);
		list.add("java");
		list.add(23.67);
		list.add(45.34f);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		list.remove(0);
		System.out.println(list);
		
		list.add(0, "venkatesh");
		
		System.out.println(list);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
	}

}
