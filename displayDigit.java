/*1. Write a java Program to display only digits in an alpha numeric String
(Input: 75#41* Output:7541)*/

package com.java.core.stringprograms.CodingChallenge2;

import java.util.Scanner;

public class displayDigit {

	static int len = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alpha numeric String  : ");
		String str = sc.nextLine();
		String str1 = str.trim();
		if (str1 == null || str.equals("")) {
			System.out.println("Please enter a valid string!");
		} else {
			String numericString = fetchNumerics(str1);
			System.out.println("After conversion : " + numericString);
		}
	}

	private static String fetchNumerics(String str) {
		len = str.length();
		char ch;
		int ascii;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			ascii = ch;
			if (ascii >= 48 && ascii <= 57) {
				temp += (char) ascii;
			}
		}
		return temp;
	}

}
