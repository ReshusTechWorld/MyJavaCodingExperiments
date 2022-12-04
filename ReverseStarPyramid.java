/*8.write a program to create a * pyramid pattern*/

import java.util.Scanner;

class ReverseStarPyramid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println();
		for(int i = 1;i<= rows;i++){
			for(int k = 1;k<i;k++){
				
				System.out.print(" ");
			}
			for(int j = i;j<= rows;j++){
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}

/* op: 
	Enter the number of ros : 5
	
	       * * * * *
		* * * *
		 * * *
		  * *
		   *
		
*/