/*6.write a program to swap to numbers without creating a third variable  */

import java.util.Scanner;

class SwapNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("Before Swap:");
		System.out.println("a= " + a + " & b= " +b);
		System.out.println("After Swap:");
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a= " + a + " & b= " +b);
		
	}

}

/* op: 
	Enter the first number:
	5
	Enter the second number:
	8
	Before Swap:
	a= 5 & b= 8
	Before Swap:
	a= 8 & b= 5
		
*/