package com.java.core.stringprograms;

import java.util.Scanner;

public class StringPalindrome {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		String rev = stringReverse(str);
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Given string is palindrom");
		}else {
			System.out.println("Given string is not palindrom");
		}
	}

	private static String stringReverse(String str) {
		String temp = "";
		if(str =="" || str == null || str.isEmpty() || str.length() == 0) {
			return "null";
		}
		
		for(int i = str.length()-1;i>=0;i--) {
			 temp += str.charAt(i);
		}
		return temp;
		
	}
}
