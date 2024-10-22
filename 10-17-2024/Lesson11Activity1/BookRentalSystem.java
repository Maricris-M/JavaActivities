package Lesson9Activity1;

import java.io.*;
import java.util.Scanner;

public class BookRentalSystem {
	public static File f;
	
	// Task 5: Instantiate and populate data
	public static Book[] book = {new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1956), 
			new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960), 
			new NonFictionBook("The Tipping Point", "M. Gladwell", 2000), 
			new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997)};

	public static void main(String[] args) throws IOException {
		// Task 8: call the displayBooks and rentedBooks functions
		//displayBooks();
		//rentedBooks();
		
		// L11 Task 2: Call the functions
		writeToFile();
		readFromFile();
	}
	
	// Task 6: Method that prints all the books
	public static void displayBooks() {
		System.out.println("* * * * * * * * * * L I B R A R Y * * * * * * * * * *");
		for(int i = 0; i < book.length; i++) {
			System.out.println(book[i].toString());
		}
	}
	
	// Task 7: Method that prints the rented books
	public static void rentedBooks() {
		System.out.println("\n* * * * * * * BOOKS RENTED, NEVER READ * * * * * * *");
		String name;
		for (int i = 0; i < book.length; i++) {
			name = book[i].getTitle();
			if (name.equalsIgnoreCase("The Lord of the Rings") || name.equalsIgnoreCase("The Tipping Point")) {
				book[i].rent();
			}
		}
		
		for(int i = 0; i < book.length; i++) {
			if(book[i].isRented()) {
				System.out.println(book[i].toString());
			}
		}
	}
	
	// L11 Task 1: Added writeToFile and readFromFile functions
	public static void writeToFile() throws IOException {
		f = new File("C:\\Users\\maricris.mariano\\eclipse-workspace\\Mariano_Encapsulation\\src\\Lesson9Activity1\\library.txt");
		FileWriter fw = new FileWriter(f);
		
		fw.write("* * * * * * * * * * L I B R A R Y * * * * * * * * * *\n");
		for(int i = 0; i < book.length; i++) {
			fw.write(book[i].toString() +"\n");
		}

		fw.write("\n* * * * * * * BOOKS RENTED, NEVER READ * * * * * * *\n");
		String name;
		for (int i = 0; i < book.length; i++) {
			name = book[i].getTitle();
			if (name.equalsIgnoreCase("The Lord of the Rings") || name.equalsIgnoreCase("The Tipping Point")) {
				book[i].rent();
			}
		}
		
		for(int i = 0; i < book.length; i++) {
			if(book[i].isRented()) {
				fw.write(book[i].toString() +"\n");
			}
		}
		
		fw.flush();
		fw.close();
	}
	
	public static void readFromFile() throws IOException {
		Scanner sc = new Scanner(f);
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}
}
