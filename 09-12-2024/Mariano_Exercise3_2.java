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
		
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("| Airline Reservation Systems |");
		System.out.println("+++++++++++++++++++++++++++++++\n");
		
		while (seatsNotFull) {
			type = inputType();
			if (type == 1) {				
				if (firstClassCounter == 5 && economyCounter != 5) {
					changeSection(type);
				} else {
					reserve(type);
				}
			} else {
				if (economyCounter == 5 && firstClassCounter != 5) {
					changeSection(type);
				} else {
					reserve(type);
				}
			}
			seatChecker();
		}
		
		keyboard.close();
		System.out.println("================");
		System.out.println("| Departing... | ");
		System.out.println("================");
		System.exit(0);
	} // end of main method
	
	public static int inputType() {
		int classType = 0;
	
		do {
			System.out.println("--------------------------------------");
			System.out.println("|            Class Types             |");
			System.out.println("|   [1] First Class or [2] Economy   |");
			System.out.println("--------------------------------------");
			System.out.print("Please enter the number of your choice: ");
			classType = keyboard.nextInt();
			
			if (classType != 1 && classType != 2) {
				System.out.println(">> Error! Valid class types are 1 [First Class] and 2 [Economy] only. << \n");
			}
		} while (classType != 1 && classType != 2);
		
		return classType;
	} // end of inputType method
	
	public static void reserve(int type) {
		System.out.println("\n--------------------------------");
		System.out.println("|      - Boarding Pass -       |");
		if (type == 1) {
			seats[firstClassCounter] = 'X';
			firstClassCounter++;
			System.out.println("|      Type: First Class       |");
			System.out.println("|      Seat Number: "+ firstClassCounter +"          |");
		} else {
			seats[economyCounter+5] = 'X';
			economyCounter++;
			System.out.println("|      Type: Economy           |");
			System.out.println("|      Seat Number: "+ economyCounter +"          |");
		}
		System.out.println("--------------------------------");
		System.out.println(" "+ Arrays.toString(seats));
		System.out.println("--------------------------------\n");
	} // end of reserve method
	
	public static void changeSection(int type) {
		String changeSection;
		boolean inputChecker = false;
		
		do {
			if (type == 1) {
				System.out.println("\n----- First Class section is full. -----");
				System.out.print("Do you want to be placed in the Economy section? [Yes/No]: ");
				changeSection = keyboard.next();
				
				if (changeSection.equalsIgnoreCase("yes")) {
					inputChecker = true;
					reserve(type+1);
				} else if (changeSection.equalsIgnoreCase("no")) {
					inputChecker = true;
					System.out.println("\n----- Next flight leaves in 3 hours. -----\n");
				}
			} else {
				System.out.println("\n----- Economy section is full. -----");
				System.out.print("Do you want to be placed in the First Class section? [Yes/No]: ");
				changeSection = keyboard.next();
				
				if (changeSection.equalsIgnoreCase("yes")) {
					inputChecker = true;
					reserve(type-1);
				} else if (changeSection.equalsIgnoreCase("no")) {
					inputChecker = true;
					System.out.println("\n----- Next flight leaves in 3 hours. -----\n");
				}
			}
		} while (inputChecker == false);
	} // end of changeSection method
	
	public static void seatChecker() {
		if (firstClassCounter == 5 && economyCounter == 5) {
			seatsNotFull = false;
		}
	} // end of seatChecker method

} // end of class
