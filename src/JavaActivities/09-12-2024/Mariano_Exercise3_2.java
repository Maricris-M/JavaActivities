package JavaActivities;

import java.util.*;

public class Mariano_Exercise3_2 {
	
	public static char[] seats = new char[10];
	
	public static void main(String[] args) {
		Arrays.fill(seats, 'x');
		reserve();
		
		
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
	
	public static void reserve() {
		int type = inputType();
		
		for (int i = 0; i < 5; i++) {
			if (seats[i] == 'x') {
				seats[i] = 'o';
				System.out.println(Arrays.toString(seats));
			}
			while (seats[i] == 1) {
				if (seats[i]+1 == 'x') {
					seats[i] = 'o';
					System.out.println(Arrays.toString(seats));
				} else if (seats[4] == 'o') {
					System.out.println("The First Class is full.");
				}
			}
			
		}
		
	}
	
	public static void economy() {
		
	}
	


}
