package a;

import java.util.Arrays;

public class New2DArr {

	public static void main(String[] args) {
		System.out.println();
		int[][] arr = new int[5][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[5];
		arr[3] = new int[1];
		arr[4] = new int[6];
		

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------");
		
		int[] arr1 = new int[5];
		int arr2[] = {2, 5, 6, 9, 3, 1};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("----------------------------------------------------");
		int[][] arr2D = {{2, 4, 6, 7}, {3, 8, 2, 9, 1},{5, 7}};
		System.out.println(Arrays.deepToString(arr2D));
		
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < arr2D.length; i++) {
			System.out.println(Arrays.toString(arr2D[i]));
		}
		
		
		
		
	}// end

}//end
