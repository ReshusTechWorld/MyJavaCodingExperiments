/* 5 Write a program to count number of vowels in a given String*/

package com.java.core.stringprograms.CodingChallenge2;

import java.util.Scanner;

public class CountVowels {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		int count = NumberOfVowel(str);
		System.out.println("Total Number of Vowels = " + count);
	}

	private static int NumberOfVowel(String str) {
		int total = 0, t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0;
		if (str != "" || str != null) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
					t1++;
				} else if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
					t2++;
				} else if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
					t3++;
				} else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
					t4++;
				} else if (str.charAt(i) == 'u' || str.charAt(i) == 'U') {
					t5++;
				}
			}

			System.out.println("Total occurence of A = " + t1);
			System.out.println("Total occurence of E = " + t2);
			System.out.println("Total occurence of I = " + t3);
			System.out.println("Total occurence of O = " + t4);
			System.out.println("Total occurence of U = " + t5);
			total = t1 + t2 + t3 + t4 + t5;
		}
		return total;
	}

}
