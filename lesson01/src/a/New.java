package a;

public class New {

	public static void main(String[] args) {
		
		int r = (int)(Math.random() * 101);
		
		if (r > 5) {
			System.out.println("big");
		} else {System.out.println("small");}
		
		
		int grade = (int)(Math.random() * 101);
		System.out.println(grade);
		
		if (grade < 50) {
			System.out.println("not good");
		}else if (grade < 70) {
			System.out.println("good");
		}else if (grade < 90) {
			System.out.println("very good");
		}else {System.out.println("very very good!!!!!");}

	}
	
	
	


}
