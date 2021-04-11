package com.clts;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exp5 {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> products = new TreeMap<String, Integer>();
		
		products.put("apple", 34500);
		products.put("lenovo", 24000);
		products.put("asus", 3400);
		products.put("dell", 20000);
		products.put("sony", 50000);
		products.put("thinkpad", 345000);
		
		
		System.out.println(products);
		
		
		Iterator<Entry<String, Integer>> itr = products.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> et = itr.next();
			
			System.out.println("Product : "+et.getKey()+" Price : "+et.getValue());
		}
		
	}

}
