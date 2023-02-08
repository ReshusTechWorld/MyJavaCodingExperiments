/*. How to Remove Given Element from an Array in Java? */

package com.java.core.arrayprograms.CodingChallenge3_Arrays;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int size;
			int k=0;
			String element;
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the size of the array");
			size = sc.nextInt();

			String a[] = new String[size];
			String temp[] = new String[size];
			
			System.out.println("Enter the elements:");
			for (int i = 0; i < size; i++) {
				a[i] = sc.next();
			}
			
			System.out.println("Enter the element to be removed");
			element = sc.next();
			
			for(int i=0;i<size;i++) {
				if(!a[i].equals(element)) {
					temp[k] = a[i];
					k++;
				}
			}
			System.out.println("Resultant array after removing the element");
			for(int i=0;i<k;i++) {
				System.out.println(temp[i] + "");
			}

	}

}
