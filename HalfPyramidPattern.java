/*10.Write A Program To Print Inverted Half Pyramid Pattern Using Numbers In Java */

import java.util.Scanner;

class HalfPyramidPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println();
		for(int i = rows;i>= 1;i--){
			for(int j = 1;j<=i;j++){
				System.out.print(j+" ");
			}
			for(int j = rows;j>i;j--){
				
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}

/* op: 
	Enter the number of ros : 5

		   1 2 3 4 5
		   1 2 3 4
		   1 2 3
		   1 2
		   1
		
*/