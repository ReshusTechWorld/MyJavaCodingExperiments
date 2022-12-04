/*7.write a program to check whether the input year is a leap year or not*/

import java.util.Scanner;

class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		if((year % 4 == 0 && year % 100 !=0)|| (year%400 == 0)) {
			System.out.println(year + " is a Leap year!");
		}else{
			System.out.println(year + " is not a Leap year!");
		}
	}

}

/* op: 
	Enter the year:
	2012
	2012 is a Leap year!

	Enter the year:
	2002
	2002 is not a Leap year!
		
*/