/* 4.write a program to check whether the number is amstrong or not ? */

import java.util.Scanner;

class AmstrongNumber{
	public static void main(String args[]){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int n1 = n;
		while(n>0){
			
			int r = n%10;
			sum = sum+(r*r*r);
			n = n/10;
		}
		if(sum == n1){
			System.out.println(n1+" is a amstrong number");
		}else{
			System.out.println(n1+" is not a amstrong number");
		}
	}

}

/* op: 
	Enter the number:
	371
	371 is a amstrong number

	Enter the number:
	245
	245 is a amstrong number	
*/