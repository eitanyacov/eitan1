package a;

import java.util.Arrays;
import java.util.Scanner;

public class ArrNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter 1 name: ");
		String name1 = scan.nextLine();
		System.out.println("please enter 2 name: ");
		String name2 = scan.nextLine();
		System.out.println("please enter 3 name: ");
		String name3 = scan.nextLine();
		System.out.println("please enter 4 name: ");
		String name4 = scan.nextLine();
		System.out.println("please enter 5 name: ");
		String name5 = scan.nextLine();
		scan.close();
		
		String[] names = new String[5];
		names[0] = name1;
		names[1] = name2;
		names[2] = name3;
		names[3] = name4;
		names[4] = name5;
		
		
		System.out.println(Arrays.toString(names));
		
		

	}

}
