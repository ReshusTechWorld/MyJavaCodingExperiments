/*11.Write A Program To Print Hollow Rectangle Using '*' In Java */

import java.util.Scanner;

class HollowRectanglePattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println();
		for(int i = 1;i<= rows;i++){
			for(int j = 1;j <= rows+1;j++){
				if(i == 1 || i == rows || j ==1 || j==rows+1){
					System.out.print("*");	
				}else{
					System.out.print(" ");	
				}
			}	
			
			System.out.println();
		}
	}
}

/* op: 
	Enter the number of rows : 3

		   * * * *
		   *	 *
		   * * * *
*/