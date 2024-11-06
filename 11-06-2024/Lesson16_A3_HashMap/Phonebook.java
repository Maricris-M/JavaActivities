package L16Activity;

import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class Phonebook {
	static Scanner keyboard = new Scanner(System.in);
	static HashMap<String, Long> contacts = new HashMap<>();
	
	// Add Contact
	public static void addContact() {
		OutOfBoundDigitException outOfBException = new OutOfBoundDigitException("");
		String name;
		long number;
		
		System.out.print("Input name here: ");
		name = keyboard.next();
		
		try {
			System.out.print("Input number of " + name +" here: ");
			number = keyboard.nextLong();
			outOfBException.validateDigits(number);
			contacts.put(name, number);
		} catch  (OutOfBoundDigitException e) {
			System.err.println(e.getMessage());
		}
	}
	
	// Display Contact
	public static void display() {
		for (Entry<String, Long> name : contacts.entrySet()) {
			System.out.println("+ " + name.getKey());
		}
	}
	
	// Search Contact
	public static void search() {
		System.out.print("Input name here: ");
		String name = keyboard.next();
		
		if (contacts.containsKey(name) ) {
			System.out.println("Contact number: " + contacts.get(name));
		} else {
			System.err.println("\nContact number of "+ name + " does not exist.");
		}
	}	
}

class OutOfBoundDigitException extends Exception {

	private static final long serialVersionUID = 1L;

	public OutOfBoundDigitException(String message) {
		super(message);
	}
	
	public void validateDigits(long number) throws OutOfBoundDigitException {
		String str;
		int str_length;
		boolean isValid = false;
		
		// converts long to string
		str = Long.toString(number);
		
		// finds the length of the converted string
		str_length = str.length();
		
		// checks if length of inputed number is equals to 10. If true, update the isValid true.
		if (str_length ==  10) {
			isValid = true;
		} else {
			// throw the exception
			throw new OutOfBoundDigitException("Invalid phone number! Only 10-digit number is allowed.");
		}	
	}
	
}
