/* 2.write a program to check whether the number is palindrome or not? */

import java.util.Scanner;

class NumberPalindrome{
	public static void main(String args[]){
		int r =0,n1 = 0,n2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		n2 = n;
		while(n > 0 )
		{
			r = n%10;
			n1 = (n1*10)+r;
			n = n/10;
		}
		if(n1 == n2){
			System.out.print(n2 + "is palindrome");
		}else{
			System.out.print(n2 + "is not palindrome");
		}
	}

}

/* op: 
	Enter the number = 145
	145 is not palindrome

	Enter the number = 323
	323 is not palindrome
		
*/