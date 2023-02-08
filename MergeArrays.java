/*3. Write a Java Program How to Merge Two Arrays*/

package com.java.core.arrayprograms.CodingChallenge3_Arrays;

import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the first array : ");
		size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the elements of the first array : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the size of the second array : ");
		size = sc.nextInt();

		int b[] = new int[size];

		System.out.println("Enter the elements of the first array : ");
		for (int i = 0; i < size; i++) {
			b[i] = sc.nextInt();
		}

		int total_length = a.length + b.length;
		int c[] = new int[total_length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		int last_index = a.length;
		for (int i = 0; i < b.length; i++) {
			c[last_index + i] = b[i];
		}

		System.out.println("The resultant array after merge is : ");
		for (int i = 0; i < total_length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
