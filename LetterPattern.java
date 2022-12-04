/*14.Create A Pattern Program In Java Using Letters*/

import java.util.Scanner;

class LetterPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println();
		int alphabet = 65; 
		for(int i = 1;i<= rows;i++){
			for(int k = 1;k<i;k++){
				
				System.out.print(" ");
			}
			for(int j = i;j<= rows;j++){
				System.out.print((char) alphabet + " ");
				alphabet++;
           	 	}
			alphabet = 65; 
			System.out.println();
		}
	}
}

/* op: 
	Enter the number of rows : 5
		A B C D E
		 A B C D
                  A B C
                   A B
                    A
		 
*/