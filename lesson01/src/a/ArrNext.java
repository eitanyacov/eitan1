package a;

public class ArrNext {

	public static void main(String[] args) {
		
		int[] arr = {3, 6, 8, 9, 15};
		
		// use for loop to iterate over the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		// use for-each loop to iterate over the array
		
		for (int x : arr) {
			System.out.println(x);
		}
		

	}//end

}//end
