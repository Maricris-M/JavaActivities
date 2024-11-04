package L4Activity1;

import java.util.*;

import exception.OutOfBoundDigitException;

public class Mariano_L4Activity1 {
	static final int length = 5;
	static String[] name = new String[length];
	static Long[] phoneNumber = new Long[length];
	static int nameIndex = 0;
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		OutOfBoundDigitException outOfBException = new OutOfBoundDigitException("");
		int ctr = 1;
		
		do {
			System.out.print("Input name #" + ctr +" here: ");
			name[nameIndex] = keyboard.next();
			
			if (name[nameIndex].equalsIgnoreCase("n/a")) {
				print();
				break;
			} else {
				try {
					long temp;
					System.out.print("Input number of " + name[nameIndex] +" here: ");
					temp = keyboard.nextLong();
					outOfBException.validateDigits(temp);
					phoneNumber[nameIndex] = temp;
				} catch  (OutOfBoundDigitException e) {
					System.err.println(e.getMessage());
					nameIndex--;
					ctr--;
				}
				nameIndex++;
				ctr++;
			}
			
		} while (ctr <= 5);
		
		boolean searchName = true;
		do {
			String searchAnswer;
			System.out.print("\nDo you want to search a contact? [Yes/No]: ");
			searchAnswer = keyboard.next();
				
			if (searchAnswer.equalsIgnoreCase("Yes")) {
				search();
			} else if(searchAnswer.equalsIgnoreCase("No")) {
				searchName = false;
				break;
			} else {
				System.err.println("Error! Valid Input are Yes or No only.");
				searchName = false;
				break;
			}	
		} while (searchName = true);
			
	}
	
	public static void search() {
		String answer = "";
		
		System.out.print("Search a name: ");
		answer = keyboard.next();
		
		for (int i = 0; i < name.length; i++) {
			if (answer.equalsIgnoreCase(name[i])) {
				System.out.println("\nName: " + name[i]);
				System.out.println("Phone Number: " + phoneNumber[i]);
			}
		}
	}
	
	public static void print() {
		int counter = 1;
		System.out.println("\nContacts: ");
		for (int i = 0; i < name.length-1; i++) {			
			if (name[i].equals(null)) {
				continue;
			} else {
				if (!name[i].equalsIgnoreCase("n/a")) {
					System.out.println("[" + counter +"] " + name[i]);
					counter++;	
				}
			}
		}
	}
		
}
