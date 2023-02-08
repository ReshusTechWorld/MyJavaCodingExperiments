/*2. Write a program to convert Given String onto uppercase and lowercase without
using String Method*/

package com.java.core.stringprograms.CodingChallenge2;

import java.util.Scanner;

public class CaseConversion {

	private static Scanner sc;
	static int len = 0;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Enter the Uppercase String  : ");
		String str = sc.nextLine();
		String str1 = str.trim();
		if (str1 == null || str.equals("")) {
			System.out.println("Please enter a valid string!");
		} else {
			String lowercase = covertToLowercase(str1);
			System.out.println("After conversion : " + lowercase);
		}
		
		System.out.println("Enter the Lowercase String  : ");
		String ustr = sc.nextLine();
		String ustr1 = ustr.trim();
		if (ustr1 == null || ustr.equals("")) {
			System.out.println("Please enter a valid string!");
		} else {
			String uppercase = covertToUppercase(ustr1);
			System.out.println("After conversion : " + uppercase);
		}
	}

	private static String covertToUppercase(String str) {
		len = str.length();
		char ch;
		int ascii;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			ascii = ch;
			if (ascii >= 97 && ascii <= 122) {
				ascii = ascii - 32;
				temp += (char) ascii;
			} else {
				temp += (char) ascii;
			}
		}
		return temp;
	}

	private static String covertToLowercase(String str) {
		len = str.length();
		char ch;
		int ascii;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			ascii = ch;
			if (ascii >= 65 && ascii <= 90) {
				ascii = ascii + 32;
				temp += (char) ascii;
			} else {
				temp += (char) ascii;
			}
		}
		return temp;
	}
}
