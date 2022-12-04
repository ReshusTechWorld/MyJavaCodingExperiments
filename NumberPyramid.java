/*12.Create A Number Pyramid Program In Java */

import java.util.Scanner;

class NumberPyramid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int k = 1;
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println();
		for(int i = 1;i<= rows;i++){
			for(int j=1;j < i+1;j++){
				if(k <= 9){
					System.out.print(k +"  ");
				}else{
					System.out.print(k +" ");
				}
				
				k++;	
			}
				
			System.out.println("\n");
		}
	}
}

/* op: 
	Enter the number of rows : 6

		  1
		  
		  2  3
		  
                  4  5  6
		 
		  7  8  9  10
		  
		  11 12 13 14 15
		  
		  16 17 18 19 20  21
		 
*/