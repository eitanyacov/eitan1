package a;

public class Boom7BoomDigi {

	public static void main(String[] args) {
		
		
		lbl:for (int i = 1; i < 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i + " boom");
				continue;
			}
		  int x = i;
		  while(x != 0) {
			  int d = x % 10;
			  if (d == 7) {
				  System.out.println(i + " bang");
				  continue lbl;
			  }
			  x = x / 10;
		  }
		  System.out.println(i);
		
		}

	} // end of main method

}// end of main class
