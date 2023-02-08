package com.java.core.arrayprograms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int size = 0;
		int flag = 0;
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
			if (a[i] == se) {
				System.out.println(se + " is present in the position " + i);
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println(se + " is not present in the array");
		}

	}
}
