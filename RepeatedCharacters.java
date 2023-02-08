/*4 Write a program to print repeated characters from a given String*/

package com.java.core.stringprograms.CodingChallenge2;

import java.util.Scanner;

public class RepeatedCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String  : ");
		String str = sc.nextLine();
		String str1 = str.trim();
		String str2 = str1.toLowerCase();
		if (str1 == null || str.equals("")) {
			System.out.println("Please enter a valid string!");
		} else {
			System.out.println("Repeated Characters Are : ");
			String temp = "";
			for (int i = 0; i < str1.length(); i++) {
				char ch = str2.charAt(i);
				if (ch != 32) { // check for white space
					if (temp.indexOf(ch) != -1)
						continue;
					int count = getCount(str2, ch);
					if (count > 1)
						System.out.println("The Character '" + ch + "' appears " + count + " times.");
					temp += ch;
				}
			}
		}
	}

	private static int getCount(String str, char ch) {
		String str1 = str.replace(ch + "", "");
		return str.length() - str1.length();
	}

}
