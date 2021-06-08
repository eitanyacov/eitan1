package a;

public class Char {

	public static void main(String[] args) {
		
		for (char c = 'A'; c <= 'Z'; c++) {
			
			System.out.print(c + ", ");
		}
		
		for (int c1 = 1, c2 = 10, c3 = 100; c1 <= 3; c1++, c2+=10, c3+=100) {
			System.out.println(c1 + ", " + c2 + ", " + c3);
		}
		
	} //end

} //end
