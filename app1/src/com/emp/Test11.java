package com.emp;

import java.util.ArrayList;
import java.util.Iterator;

public class Test11 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("java");
		al.add("java");
		al.add("java");
		al.add("java");
		al.add("java");
		al.add("java");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			if(al.contains("java"))
			{
			itr.remove();
			}
		}
	}

}
