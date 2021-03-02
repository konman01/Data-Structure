package com.konman01.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Basics {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		// Adding element to list
		// add function adds the element to the end of the list
		list.add(10);
		
		list.add(20);
		
		list.add(30);
		
		list.add(40);
		
		list.add(50);
		
		// add element in between the list
		list.add(3, 100);
		
		// Loop through the list
		for(int i = 0; i <list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		// check if element is present in the list
		System.out.println("Element 10 present in the list:"+list.contains(10));
		
		// check if the list is empty
		System.out.println("Is list empty:"+list.isEmpty());
		
		System.out.println("Index of element 100 is:"+list.indexOf(100));
		
		int removedval = list.remove(3);
		
		System.out.println("Removed Element is:"+removedval);
		
		
		Object[] arr = list.toArray(); 
		
		
		for(int i = 0; i <arr.length; i++) {
					
			System.out.println((Integer)arr[i]);
		}
		
		String str = list.toString();
		
		System.out.println(str);
		
		// Defining list under list
		List<List<Integer>> list1 = new ArrayList<>();
		list1.add(list);
		
		for(int i =0; i<list1.size(); i++) {
			
			List<Integer> list_local = list1.get(i);
			
			for(int j = 0; j<list_local.size(); j++) {
				System.out.println(list_local.get(j));
			}
			
		}
		
		
		
		
		
		
		
		
		return;
	}

}
