package JavaActivities;

import java.util.*;

public class Mariano_Exercise3_2 {
	
	public static Scanner keyboard = new Scanner(System.in);
	public static char[] seats = new char[10];
	public static int firstClassCounter = 0;
	public static int economyCounter = 0;
	public static boolean seatsNotFull = true;
	
	public static void main(String[] args) {
		Arrays.fill(seats, '0');
		int type;
		
		// firstClassCounter != 5 || economyCounter != 5 // seats[4] != 'X' || seats[9] != 'X'
		while (seatsNotFull) {
			type = inputType();
			if (type == 1) {				
				if (firstClassCounter == 5 && economyCounter != 5) {
					changeSection(type);
				} else {
					firstClass();
				}
			} else {
				if (economyCounter == 5 && firstClassCounter != 5) {
					changeSection(type);
				} else {
					economy();
				}
			}
			seatChecker();
		}
		
		keyboard.close();
		System.out.println("Departing in 3... 2... 1");
		System.exit(0);
	}
	
	public static int inputType() {
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
		seats[firstClassCounter] = 'X';
		firstClassCounter++;
		System.out.println(Arrays.toString(seats));
	}
	
	public static void economy() {
		seats[economyCounter+5] = 'X';
		economyCounter++;
		System.out.println(Arrays.toString(seats));
	}
	
	public static void changeSection(int type) {
		String changeSection;
		boolean inputChecker = false;
		
		do {
			if (type == 1) {
				System.out.println("First Class section is full. "
						+ "Do you want to be placed in the Economy section? [Yes/No]: ");
				changeSection = keyboard.next();
				
				if (changeSection.equalsIgnoreCase("yes")) {
					inputChecker = true;
					economy();
				} else if (changeSection.equalsIgnoreCase("no")) {
					inputChecker = true;
					System.out.println("Next flight leaves in 3 hours.");
				}
			} else {
				System.out.println("Economy section is full. "
						+ "Do you want to be placed in the First Class section? [Yes/No]: ");
				changeSection = keyboard.next();
				
				if (changeSection.equalsIgnoreCase("yes")) {
					inputChecker = true;
					firstClass();
				} else if (changeSection.equalsIgnoreCase("no")) {
					inputChecker = true;
					System.out.println("Next flight leaves in 3 hours.");
				}
			}
		} while (inputChecker == false);
	}
	
	public static void seatChecker() {
		if (firstClassCounter == 5 && economyCounter == 5) {
			seatsNotFull = false;
		}
	}

}
