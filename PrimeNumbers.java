/* 5.write a program to prime numbers with in the limit */

import java.util.Scanner;

class PrimeNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit = sc.nextInt();
		System.out.println("Prime numbers:");
		for(int i=2;i<=limit;i++){
			int k = 0;
			for(int j=2;j<limit/2;j++){
				if(i%j == 0 && i != j){
					k = 1;
					break;
				}
			}
			if(k == 0){
				System.out.print(i + ", ");
			}	
			
		}
	}

}

/* op: 
	Enter the limit:
	100
	Prime numbers:
	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,	
*/