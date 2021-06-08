package a;

public class Random1 {

	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 50);
		System.out.println(random);
		System.out.println();
		for (int i = 0; i <= random; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		 
		
	}// end

}//end
