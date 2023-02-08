package com.java.core.arrayprograms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int size = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		size = sc.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the elements of : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			int large_index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					large_index = j;
					int temp = a[i];
					a[i] = a[large_index];
					a[j] = temp;
				}
			}

		}
		System.out.println("Array After Selection Sort In Descending Order:  ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
