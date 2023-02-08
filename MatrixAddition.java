package com.java.core.arrayprograms;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		int r = 0, c = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers of rows : ");
		r = sc.nextInt();

		System.out.println("Enter the numbers of columns : ");
		c = sc.nextInt();

		int a[][] = new int[r][c];
		int b[][] = new int[r][c];

		System.out.println("Enter the elements of first matrix : ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of second matrix : ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Resultant matrix after addition : ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" + ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(b[i][j] +  " ");
			}
			System.out.println();
		}
		System.out.println(" = ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + b[i][j] + " ");
			}
			System.out.println();
		}

	}

}
