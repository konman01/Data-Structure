package com.konan01.hashset;

import java.util.HashSet;

public class Basics {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		
		System.out.println(set.contains(1));
		
	}

}
