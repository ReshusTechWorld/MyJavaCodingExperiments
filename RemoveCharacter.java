/*7 Write a Java Program to Remove first and last character of a string in Java*/

package com.java.core.stringprograms.CodingChallenge2;

import java.util.Scanner;

public class RemoveCharacter {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String str1 = str.trim();
		if (str1 == null || str.equals("")) {
			System.out.println("Please enter a valid string!");
		} else {
			if (str.length() < 2) {
				System.out.println("Please enter a valid string!");
			} else {
				int length = str.length();
				String subStr = str.substring(1, length - 1);
				System.out.println(subStr);
			}

		}
	}
}
