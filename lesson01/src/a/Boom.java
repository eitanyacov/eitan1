package a;

import java.util.Scanner;

public class Boom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter limit: ");
		int max = scan.nextInt();
		scan.close();
		lbl:for (int i = 1; i < max; i++) {
			if (i % 7 == 0) {
				System.out.println(i + " boom");
				continue;
			}
			System.out.println(i);
			   int x = i;
			while (x != 0) {
				int d = x % 10;
				if (d == 7) {
					System.out.println(i + " bang");
					continue lbl;
					
				}
				x = x / 10;
			}
			
			
		}
		
//		for (int i = 0; i < 100; i ++) {
//			if (i % 7 == 0) {
//				System.out.println(i + "boom");
//			}
//			System.out.println(i);
//		}

	}// end

}// end
