package Lesson9Activity1;

public class Book {
	
	// Task 1: Fields declaration
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;
	
	// Task 2: Constructor with the first three fields
	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.isRented = false; // default value
	}
	
	// Getters and Setters
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getYearPublished() {
		return yearPublished;
	}
	
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	public boolean isRented() {
		return isRented;
	}
	
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	
	// Task 3: rent function
	public void rent() {
		this.isRented = true;
	}
	
	// toString method
	public String toString() {
        return String.format("%-30s%-20s%d", title, author, yearPublished);
    }

}
