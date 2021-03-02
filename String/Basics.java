package com.konman01.string;

public class Basics {
	
	public static void main(String[] args) {
		
		String val1 = "";
		val1 = val1 + "1";
		System.out.println(val1);
		
		String val2 = "";
		
		// Check the string values are equal or not
		if(val2.equals("")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		int val3 = 5;
		
		// Representing the Integer value in String
		System.out.println(String.valueOf(val3));
		
		char[] arr = {'a', 'e', 'i', 'o', 'u'};
		
		// Convertinf Char Array to String
		System.out.println(String.valueOf(arr));
		
		// Check if a Character is Alphabetic or not
		char c = '1';
		System.out.println(Character.isAlphabetic(c));
		
		// check if a charcter is digit
		System.out.println(Character.isDigit(c));
		
		// Converting the character to upper case and lower case
		char c1 = 'C';
		char c2 = 'c';
		System.out.println(Character.toLowerCase(c1));
		System.out.println(Character.toUpperCase(c2));
		
		// Checking if the character is a whiteb Space
		char c3 = ' ';
		System.out.println(Character.isWhitespace(c3));
		
		// coverting character to String
		System.out.println(Character.toString(c1));
		
		// Chwck if the Character is Letter or Digit
		System.out.println(Character.isLetterOrDigit('-'));
		
		System.out.println(Character.isLetter('-')); // False
		
		System.out.println(Character.isLetter('a')); // true
		
		System.out.println(Character.isLetter('1')); // False
		
		System.out.println(Character.isLetter('B')); // true
		
		// to Trim the white Spaces
		String name = "   Manjunatha  ";
		System.out.println(name.trim());
		
		// To covert the String to String Array
		
		
		
		
	}// end of main function
	

}// end of class
