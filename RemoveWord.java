/*Java Program to Remove a Given Word from a String*/

package com.java.core.stringprograms.CodingChallenge2;

import java.util.Scanner;

public class RemoveWord {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String str = sc.nextLine();
		String str1 = str.trim();

		if (str1 == null || str1.equals("")|| str1.isEmpty() ) {
			System.out.println("Please enter a valid String!");
		} else {

			System.out.println("Enter the word to eliminate :");
			String str2 = sc.nextLine();

			str = str + " ";
			String word = "", result = "";

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				// Forming a word
				if (ch != ' ') {
					word = word + ch;
				} else {
					// check whether word is equals to the  inputed word to eliminate 
					if (word.equalsIgnoreCase(str2)) {
						word = "";
					} else {
						result = result + " " + word;
						word = "";
					}
				}
			}
			System.out.println(result);
		}
	}

}
