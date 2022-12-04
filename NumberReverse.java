/* 1.write a program to find the reverse of a number? */

import java.util.Scanner;

class NumberReverse{
	public static void main(String args[]){
		int r =0,n1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Reverse of " +n +" = ");
		while(n > 0 )
		{
			r = n%10;
			n1 = (n1*10)+r;
			n = n/10;
		}
		 
		System.out.print(n1);
	}

}

/* op: 
	Enter the number = 145
	Reverse of 145 = 
	541	
*/