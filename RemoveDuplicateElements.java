/*Write a Java Program to Remove Duplicate Elements in an Array*/

package com.java.core.arrayprograms.CodingChallenge3_Arrays;

import java.util.Scanner;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the elements of : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		RemoveDuplicate(a, size);
	}

	private static void RemoveDuplicate(int[] a, int size) {
		int k = 0;
		int b[] = new int[size];
		for (int i = 0; i < size - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < size - 1; j++) {
				if (a[i] == a[j]) {
					count++;
					break;
				}
			}
			if (count == 0) {
				b[k] = a[i];
				k++;
			}
		}
		System.out.println("Resultant array after removing duplicate elements:");
		for (int i = 0; i < k; i++) {
			System.out.print(b[i] + " ");
		}

	}
}
