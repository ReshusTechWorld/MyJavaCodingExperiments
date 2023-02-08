/*3 Write a program to print reverse a of a string word by word
(Input: I am a developer Output: developer a am I)*/

package com.java.core.stringprograms.CodingChallenge2;

import java.util.Scanner;

public class WordReversal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence  : ");
		String str = sc.nextLine();
		String str1 = str.trim();

		if (str1 == null || str1.equals("")|| str1.isEmpty() ) {
			System.out.println("Please enter a valid Sentence!");
		}else {
			str = str + " ";
			String word = "", rev = "";

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				// Forming a word
				if (ch != ' ') {
					word = word + ch;
				}

				// Adding the formed word to the rev variable to reverse it
				else {
					rev = word + " " + rev;
					word = "";
				}
			}
			System.out.println(rev);
		}
	}

}
