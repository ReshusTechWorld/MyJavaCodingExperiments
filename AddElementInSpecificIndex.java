/*Write a Java Program to Insert a New Element into an Array to the Specified Index*/

package com.java.core.arrayprograms.CodingChallenge3_Arrays;

import java.util.Scanner;

public class AddElementInSpecificIndex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size;
		int index = 0;
		String element;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		size = sc.nextInt();

		String a[] = new String[size + 1];

		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.next();
		}

		System.out.println("Enter the position of the new element : ");
		index = sc.nextInt();

		System.out.println("Enter the new element to be added in the arra: ");
		element = sc.next();

		for (int pos = size; pos >= index; pos--) {
			a[pos] = a[pos - 1];
		}
		a[index - 1] = element;

		System.out.println("Resultant array after addig new elemet:");
		for (int i = 0; i <= size; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
