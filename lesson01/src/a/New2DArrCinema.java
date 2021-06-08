package a;

import java.util.Scanner;

public class New2DArrCinema {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter row number");
		int row = scan.nextInt();
		System.out.println("enter seat number in the row");
		int seatNumber = scan.nextInt();
		char[][] cinema = new char[3][5];
		populate(cinema);
		cinema[row][seatNumber] = 'x';
		print(cinema);
		
		
	}//end of main method
	
	
//    fill the matrix with empty seats 'O' charcter	
	public static void populate(char[][] cinema) {
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				cinema[i][j] = 'O';
			}
		}
	}
// print the matrix
	
	public static void print(char[][] cinema) {
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				System.out.print(" " + cinema[i][j] + " ");
			}
			System.out.println();
		}
	}

}//end of main class
