/* 3.write a program to find the average of 5 numbers? */

import java.util.Scanner;

class Average{
	public static void main(String args[]){
		int sum=0,avg=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(int i=1;i<=5;i++){
			int n = sc.nextInt();
			sum = sum+n;
		}
			avg = sum/5;
			System.out.println("Average= " + avg);
	}

}

/* op: 
	Enter 5 numbers :
	10
	15
	60
	70
	85
	Average = 48
		
*/