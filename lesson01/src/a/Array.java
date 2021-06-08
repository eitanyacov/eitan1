package a;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
//		int[] arr = {10, 12, 15, 52, 12, 6, 64, 8, 16, 5, 8, 9, 1, 14, 16, 44, 86, 54, 43, 32, 11, 54, 7, 5, 4};
//
//		
//		System.out.println(arr.length);
//		
//		System.out.println(Arrays.toString(arr));
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			 
//			sum += arr[i];
//		}
//		System.out.println(sum);
//		// araays with random numbers + add sum (total value)
		int[] nums = new int[25];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			
			int r = (int)(Math.random() * 101);
			nums[i] = r;
			sum += nums[i];
			}
		System.out.println(Arrays.toString(nums));
		System.out.println(sum);
	}// end

}// end
