package a;

public class TwoRandomNums {

	public static void main(String[] args) {
		
		
		int r1 = (int)(Math.random() * 50);
		int r2 = (int)(Math.random() * 50);
		 
		int x = 1;
		int y = 1;
		
		if (r1 < r2) {
			x = r1;
			y = r2;
		}else if (r1 > r2) {
			x = r2;
			y = r1;
		}
		System.out.println(x);
		System.out.println(y);
		
		System.out.println();
		for (int i = x; i < y; i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		

	}//end

}//end
