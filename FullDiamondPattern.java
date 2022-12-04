/*9.write a program to create a full diamond pattern using '*' in java */

import java.util.Scanner;

class FullDiamondPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println();
		for(int i = 1;i<= rows;i++){
			for(int k = i+1;k<=rows;k++){
				System.out.print(" ");
			}
			for(int j = 1;j<= i;j++){
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int i = rows-1;i>=1;i--){
			for(int k = i+1;k<=rows;k++){
				System.out.print(" ");
			}
			for(int j = 1;j<= i;j++){
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}

/* op: 
	Enter the number of ros : 5

		   *
                  * *
	      	 * * *
		* * * *
               * * * * *
		* * * *
		 * * *
		  * *
		   *
		
*/