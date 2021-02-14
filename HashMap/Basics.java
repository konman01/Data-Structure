package com.konman01.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Basics {
	
	public static void main(String[] args) {
		
		// Declaration of HashMap
		HashMap<String, String> map = new HashMap<String, String>();
		
		
		//Set HashMap
		map.put("first_name", "manjunatha");
		map.put("last_name", "koni gururaja");
		
		// Get the value from an HashMap
		System.out.println("First Name is "+map.get("first_name"));
		
		System.out.println("Last Name is "+map.get("last_name"));
		
		// Loop through the hash map
		
		System.out.println("--------------------------------------------------------------");
		
		// Using Entry Set
		for(Map.Entry entry_set: map.entrySet()) {
			String key = (String)entry_set.getKey();
			String val = (String)entry_set.getValue();
			
			System.out.println("key is:"+key);
			System.out.println("value is:"+val);
		}
		
		System.out.println("--------------------------------------------------------------");
		
		// Using Iterator
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			Entry ent = (Entry)itr.next();
			String key = (String)ent.getKey();
			String val = (String)ent.getValue();
			
			System.out.println("Key is:"+key);
			System.out.println("val is:"+val);
		}
		
		
		
	}

}
