package a;

public class SwitchGrade {

	public static void main(String[] args) {
		
    int grade = (int)(Math.random() * 11);
    
    System.out.println(grade);
    
    switch(grade) {
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    	System.out.println("fail");
    	break;
    case 6:
    	System.out.println("pass");
    	break;
    case 7:	
    case 8:	
    case 9:	
    	System.out.println("good");
    	break;
    case 10:
    	System.out.println("exelent");
    	break;
    	
     }
		
		
	} //end of main method

} //end of main class
