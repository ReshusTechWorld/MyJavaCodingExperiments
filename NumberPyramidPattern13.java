/*13.Create A Number Pyramid Program In Java*/

import java.util.Scanner;

class NumberPyramidPattern13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		int num = rows;
		System.out.println();
		for(int i = 1;i<= rows;i++){
			for(int k = i+1;k<=rows;k++){
				System.out.print(" ");
			}
			for(int j = 1;j<= i;j++){
				System.out.print(num  +" ");
			}
			num --;
			System.out.println();
		}
	}
}

/* op: 
	Enter the number of rows : 5
		5
	      4 4 4
	   3 3 3 3 3 3
         2 2 2 2 2 2 2 2
       1 1 1 1 1 1 1 1 1 1
		 
*/