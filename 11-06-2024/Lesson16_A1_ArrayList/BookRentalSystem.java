package L16Activity;

import java.io.*;
import java.util.ArrayList;

public class BookRentalSystem {
		
	public static ArrayList<Book> book = new ArrayList<>();
	
	public static void addBooks() {
		book.add(new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1956));
		book.add(new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960));
		book.add(new NonFictionBook("The Tipping Point", "M. Gladwell", 2000));
		book.add(new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997));
	}

	public static void main(String[] args) throws IOException {
		addBooks();
		displayBooks();
		rent();
		rentBooks();
	}
	
	public static void displayBooks() {
		System.out.println("* * * * * * * * * * L I B R A R Y * * * * * * * * * *");
		for (Book val : book) {
			System.out.println(val.toString());
		}
	}
	
	public static void rent() {
		String name;
		
		for (int i = 0; i < book.size(); i++) {
			name = book.get(i).getTitle();
			if (name.equalsIgnoreCase("The Lord of the Rings") || name.equalsIgnoreCase("The Tipping Point")) {
				book.get(i).rent();
			}
		}
	}
	
	
	public static void rentBooks() {
		System.out.println("\n* * * * * * * BOOKS RENTED, NEVER READ * * * * * * *");
		String name;
		for (int i = 0; i < book.size(); i++) {
			name = book.get(i).getTitle();
			if (book.get(i).isRented()) {
				if (name.equalsIgnoreCase("The Lord of the Rings")) {
					book.get(i).setDueDate("2023-12-22");
					book.get(i).setReturnedDate("2023-12-25");
					book.get(i).setFine(30);
				} else if (name.equalsIgnoreCase("The Tipping Point")) {
					book.get(i).setDueDate("2023-12-25");
					book.get(i).setReturnedDate("2023-12-18");
					book.get(i).setFine(15);
				}
			} 
		}
		
		for (int i = 0; i < book.size(); i++) {
			if(book.get(i).isRented()) {
				System.out.println(book.get(i).toStringRent());
			}
		}
	}
	
}
