package com.clts;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Exp6 {
	
	public static void main(String[] args) {
		
		Hashtable hm = new Hashtable();
		
		hm.put(1, "java");
		hm.put("name", "veanktesh");
		hm.put('e', 363);
		hm.put("city", "mpl");
		hm.put(1, "jeevan");
		
		System.out.println(hm);
		
		LinkedHashMap lm = new LinkedHashMap();
		
		lm.put(1, "java");
		lm.put("name", "veanktesh");
		lm.put('e', 363);
		lm.put("city", "mpl");
		lm.put(1, "jeevan");
		
		System.out.println(lm);
		
		Iterator<Entry> itr = hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry et = itr.next();
			
			System.out.println("Key : "+et.getKey()+" Value : "+et.getValue());
		}
		
	}

}
