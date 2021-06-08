package a;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int paasword = 123;
	    Scanner sc = new Scanner(System.in);
		
	    System.out.println("enter your password");
		int input = sc.nextInt();
		
		
		while(input != paasword) {
			System.out.println("enter password again");
			input = sc.nextInt();
		}
		
		
		System.out.println("you are logged in");
		sc.close();
		
		
		
		
		

	}// end

}// end
