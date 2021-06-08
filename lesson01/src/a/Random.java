package a;

public class Random {

	public static void main(String[] args) {
		
		int num1 = (int)(Math.random() * 101);
		int num2 = (int)(Math.random() * 101);
		
		System.out.println(num1);
		System.out.println(num2);
		int num3 = num1 + num2;
		System.out.println(num3);
		
		double avg = num3 / 2D;
		
		int intModule1  = num1 % 10;
		int intModule2  = num2 % 10;
		
		int reactAngle  = num1 * num2;
		System.out.println(avg);
		
		System.out.println(intModule1);
		System.out.println(intModule2);
		System.out.println(reactAngle);

	}

}
