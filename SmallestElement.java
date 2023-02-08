package com.java.core.arrayprograms;

import java.util.Scanner;

public class SmallestElement {
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
		System.out.println();
		int small = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < small) {
				small = a[i];
			}
		}
		System.out.println("Smallest element of the array is : " + small);
	}

}
