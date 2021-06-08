package a;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2Dpractice {

	public static void main(String[] args) {
		
		// choose a seat for the movie(row & seat number in the row)
		Scanner scan = new Scanner(System.in);
		int[][] cinema = new int[5][12];
		
		System.out.println("choose row seat for the movie");
		int row = scan.nextInt();
		System.out.println("choose number in the row seat for the movie");
		int number = scan.nextInt();
		cinema[row][number] = 1;
		for (int i = 0; i < cinema.length; i++) {
			
			for (int j = 0; j < cinema[i].length; j++) {
				 System.out.print(cinema[i][j]);
			}
			System.out.println();
		}
		
		
		
		

	}//end

}//end
