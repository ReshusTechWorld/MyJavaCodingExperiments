/*Write a Java Program for Binary Search Using Array */

package com.java.core.arrayprograms.CodingChallenge3_Arrays;

import java.util.Scanner;

public class BinarySearch {

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
		System.out.println();
		System.out.println("Enter the element for search : ");
		int se = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			int small_index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					small_index = j;
					int temp = a[i];
					a[i] = a[small_index];
					a[j] = temp;
				}
			}
		}
		System.out.println("Binary search can be performed in sorted array only!");
		System.out.println("Sorted array is : ");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}

		int last = a.length - 1;
		BinarySearchMethod(se, 0, last, a);
	}

	private static void BinarySearchMethod(int se, int first, int last, int arr[]) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < se) {
				first = mid + 1;
			} else if (arr[mid] == se) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}
}
