/*How to Check Whether Two String Are Anagram or not*/
package com.java.core.arrayprograms.CodingChallenge3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1,str2;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string:");
		str1 = sc.next();
		str1 = str1.toLowerCase();
		
		System.out.println("Enter the second string:");
		str2 = sc.next();
		str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length()) {
			char arr1[] = new char[str1.length()];
			arr1 = str1.toCharArray();
			
			char arr2[] = new char[str2.length()];
			arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			for(int i=0;i<arr1.length;i++) {
			   if(arr1[i] != arr2[i]) {
				  flag = false;
				  break;
			   }
			}
			
			if(flag == true) {
				System.out.println("Entered strings are Anagram!");
			}else {
				System.out.println("Entered strings are not Anagram!");
			}
		}else {
			System.out.println("Entered strings are not Anagram!");
		}
		
	}

}
