package L16Activity;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name = "Julia";
		
		System.out.println(name +"'s Phonebook");
		
		do {
			System.out.println("\n[1] Add contacts"
					+ "\n[2] Display contacts"
					+ "\n[3] Search contact"
					+ "\n[4] Close");
			
			System.out.print("\nEnter your choice: ");
			int input = keyboard.nextInt();
			
			if (input == 4) {
				keyboard.close();
				System.out.println("\nExiting the program...");
				System.exit(0);
			} else {
				performMenuOptions(input);
			}
		} while(true);		
	}
	
	public static void performMenuOptions(int input) {
		switch (input) {
		case 1:
			Phonebook.addContact();
			break;
		case 2:
			Phonebook.display();
			break;
		case 3:
			Phonebook.search();
			break;
		default:
			System.err.println("\nInvalid input! Kindly choose from the menu options.\n");
		}
	}
	
}
