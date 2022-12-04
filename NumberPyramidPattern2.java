/*15.Create A Pattern Program in java Using numbers */

import java.util.Scanner;

class NumberPyramidPattern2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		int k = rows;
		System.out.println();
		for(int i = 1;i<= rows;i++){
			for(int j=rows;j > 0;j--){
				if(k <= 9){
					System.out.print(k +"  ");
				}else{
					System.out.print(k +" ");
				}	
			}
			k--;	
			System.out.println("\n");
		}
	}
}

/* op: 
	Enter the number of rows : 5
		5 5 5 5 5
		4 4 4 4 4
		3 3 3 3 3
		2 2 2 2 2
		1 1 1 1 1
		 
*/