package JavaActivities;

public class Mariano_Exercise2 {
	
	public static void main(String[] args) {
		for (int j = 12; j >= 1; j--) {
			System.out.println("\nOn the "+ days(j) +" day of Chritmas my true love sent to me");
			verse(j);
		}
	}
	
	public static String days(int d) {
		String day = "";
		switch(d) {
			case(1):
				day = "twelveth";
				break;
			case(2):
				day = "eleventh";
				break;
			case(3):
				day = "tenth";
				break;
			case(4):
				day = "ninth";
				break;
			case(5):
				day = "eight";
				break;
			case(6):
				day = "seventh";
				break;
			case(7):
				day = "sixth";
				break;
			case(8):
				day = "fifth";
				break;
			case(9):
				day = "fourth";
				break;
			case(10):
				day = "third";
				break;
			case(11):
				day = "second";
				break;
			case(12):
				day = "firth";
				break;
		}
		return day;
	}	
	
	public static void verse(int x) {
		switch(x) {
		case(1):
			System.out.println("Twelve drummers drumming");
		case(2):
			System.out.println("Eleven pipers piping");
		case(3):
			System.out.println("Ten lords a-leaping");
		case(4):
			System.out.println("Nine ladies dancing");
		case(5):
			System.out.println("Eight maids a-milking");
		case(6):
			System.out.println("Seven swans a-swimming");
		case(7):
			System.out.println("Six geese a-laying");
		case(8):
			System.out.println("Five gold rings");
		case(9):
			System.out.println("Four calling birds");
		case(10):
			System.out.println("Three french hens");
		case(11):
			System.out.println("Two tutle doves");
		case(12):
			System.out.println("A partridge in a pear tree");
		}
	}
}
