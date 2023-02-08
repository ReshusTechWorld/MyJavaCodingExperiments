/*2. How to Find Third Largest and Second Smallest Element in an Array*/

package com.java.core.arrayprograms.CodingChallenge3_Arrays;

import java.util.Scanner;

public class ThirdLargestSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		size = sc.nextInt();
		
		if(size < 3) {
			
			System.out.println("Array size should be >= 3");
			System.out.println("Enter the size of the array : ");
			size = sc.nextInt();
			
		}

		int a[] = new int[size];

		System.out.println("Enter the elements of : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

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
		int last_index = (a.length)-3;
		System.out.println("Third Largest Element = " + a[last_index] );
		System.out.println("Second Smallest Element = " + a[1]);
	}
}
