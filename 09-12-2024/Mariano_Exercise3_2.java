package JavaActivities;

import java.util.*;

public class Mariano_Exercise3_2 {
	
	public static char[] seats = new char[10];
	public static int firstClassCounter = 0;
	
	public static void main(String[] args) {
		Arrays.fill(seats, '0');
		int type;
		
		while (seats[4] != 'x' && seats[9] != 'x') {
			type = inputType();
			if (type == 1) {
				firstClass();
				System.out.println(Arrays.toString(seats));
			} else {
				
			}
		}
		
	}
	
	public static int inputType() {
		Scanner keyboard = new Scanner(System.in);
		int classType = 0;
	
		do {
			System.out.print("Please type 1 for First Class and Please type 2 for Economy: ");
			classType = keyboard.nextInt();
			
			if (classType != 1 && classType != 2) {
				System.out.println("Error! Valid class types are 1 [First Class] and 2 [Economy] only.");
			}
		} while (classType != 1 && classType != 2);
		return classType;
	}
	
	public static void firstClass() {
		seats[firstClassCounter] = 'x';
		firstClassCounter++;	
		
	}

}
