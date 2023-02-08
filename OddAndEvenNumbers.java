/*Write a Java program To Print Odd and Even Numbers in An Array */

package com.java.core.arrayprograms.CodingChallenge3_Arrays;

import java.util.Scanner;

public class OddAndEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size;
		int odd_count = 0;
		int even_count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		size = sc.nextInt();

		int a[] = new int[size];
		int even[] = new int[size];
		int odd[] = new int[size];

		System.out.println("Enter the numbers:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			if (a[i] % 2 == 0) {
				even[even_count] = a[i];
				even_count++;
			} else {
				odd[odd_count] = a[i];
				odd_count++;
			}
		}
		System.out.println("Odd numbers in the array are:");
		for (int i = 0; i < odd_count; i++) {
			System.out.println(odd[i] + "");
		}
		System.out.println("Even numbers in the array are:");
		for (int i = 0; i < even_count; i++) {
			System.out.println(even[i] + "");
		}

	}

}
