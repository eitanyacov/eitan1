package a;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		int paasword = 123;
	    Scanner sc = new Scanner(System.in);
		
	    
		int input = 0;
		
		
		do {
			System.out.println("enter password: ");
			input = sc.nextInt();
		} while(input != paasword);
		
		
		System.out.println("you are logged in");
		sc.close();
		
		
		
		
		

	}// end

}// end
