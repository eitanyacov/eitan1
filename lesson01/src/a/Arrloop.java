package a;

import java.util.Arrays;
import java.util.Scanner;

public class Arrloop {

	public static void main(String[] args) {
		
		
		String[] names = new String[5];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("enter name : ");
			names[i] = scan.nextLine();
		}
		
		System.out.println(Arrays.toString(names));
		scan.close();
	}

}
