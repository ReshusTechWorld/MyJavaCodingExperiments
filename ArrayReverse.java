package com.java.core.arrayprograms;

import java.util.Scanner;

public class ArrayReverse {

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
		System.out.println("Elements of the array is : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse of the array is : ");
		for (int i = (a.length) - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}
}
