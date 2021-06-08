package a;

import java.util.Scanner;

public class SwithScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter mode: [ON, OFF, STAND_BY]");
		
		String res = scan.nextLine();
		
		scan.close();
		System.out.println(res);
		
		switch(res) {
		case "ON":
			System.out.println("the maschine is working");
		    break;
		case "OFF":
			System.out.println("the maschine is not working");
			break;
		case "STAND_BY":
			System.out.println("the maschine is in stand by");
			break;
		default:
			System.out.println("the mode " + res + " is not valid");
		
		
		}
		

	}

}
