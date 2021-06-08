package a;

import java.util.Scanner;

public class NewArr2D {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter row number");
		int row = scan.nextInt() - 1;
		
		System.out.println("enter seat number");
		int seat = scan.nextInt() - 1;
		
		
		char[][] cinema = new char[4][8];
		
//     fill the cinema seats with char 'O';		
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema.length; j++) {
				cinema[i][j] = 'O';
			}
		} 
		cinema[row][seat] = 'x';
		// print the cinema seats;
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema.length; j++) {
				System.out.print(" " + cinema[i][j] + " ");
			}
			System.out.println();
		}
		
		
		

	}//end of main method

}// end of main class
