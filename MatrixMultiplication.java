/*Write a java Program to multiply two matrices*/

package com.java.core.arrayprograms.CodingChallenge3_Arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows of first matrix : ");
		r1 = sc.nextInt();

		System.out.println("Enter the number of columns of first matrix : ");
		c1 = sc.nextInt();

		System.out.println("Enter the number of rows of second matrix : ");
		r2 = sc.nextInt();

		System.out.println("Enter the number of columns of second matrix : ");
		c2 = sc.nextInt();

		if (c1 != r2) {
			System.out.println("Matrix multiplication is not possible");
			return;
		}

		int a[][] = new int[r1][c1];
		int b[][] = new int[r2][c2];
		int result[][] = new int[r1][c2];

		System.out.println("Enter the elements of first matrix : ");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the elements of second matrix : ");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		System.out.println("Resultant matrix after multiplication : ");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(" * ");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(" = ");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				result[i][j] = 0;
				for (int k = 0; k < c1; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
