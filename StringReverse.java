package com.java.core.stringprograms;

import java.util.Scanner;

public class StringReverse {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		String rev = stringReverse(str);
		
		System.out.println("Reverse of given string is : " + rev);
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
