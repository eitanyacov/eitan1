package a;

import java.util.Arrays;

public class Arr2D {

	public static void main(String[] args) {
		
		System.out.println();
		int[][] matrix = new int[4][10];
		
		
		
//		add random numbers to the 2D array
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 101);
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		
		
		
	}//end

}//end
