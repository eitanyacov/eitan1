package a;

public class NewTwoRandom {

	public static void main(String[] args) {
		int r1 = (int)(Math.random() * 50);
		int r2 = (int)(Math.random() * 50);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();
		
		if(r1 > r2) {
			int t = r1;
			r1 = r2;
			r2 = t;
			
		}
		for (int i = r1; i <= r2; i++) {
			System.out.println(i);
		}
		
		
		
	}//end

}//end
