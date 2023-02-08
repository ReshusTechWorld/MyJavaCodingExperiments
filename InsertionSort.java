/* Write a program to sort an Array Using Insertion Sort */

package com.java.core.arrayprograms.CodingChallenge3_Arrays;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 0;
		int key_element = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the elements of : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			key_element = a[i];

			while (j >= 0 && a[j] > key_element) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key_element;
		}
		System.out.println("Resultant array after sorting: ");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
