package a;

public class NewSwitch {

	public static void main(String[] args) {

		int day = (int) (Math.random() * 7) + 1;

		System.out.println(day);

		switch (day) {

		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
        case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wendsday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("satrday");
			break;
		default:
			System.out.println("the value " + day + " is not a valid day");

		}

	} // end of main method

} // end of main class
