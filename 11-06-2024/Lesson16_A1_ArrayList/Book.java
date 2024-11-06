package L16Activity;

public class Book {
	
	// Fields declaration
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;
	
	private String dueDate;
	private String returnedDate;
	private double fine;
	
	// Constructor with the first three fields
	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.isRented = false; // default value
		this.dueDate = "";
		this.returnedDate = "";
		this.fine = 0.0;
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
	
	public void rent() {
		this.isRented = true;
	}
	
	public String getdueDate() {
		return dueDate;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public String getReturnedDate() {
		return returnedDate;
	}
	
	public void setReturnedDate(String returnedDate) {
		this.returnedDate = returnedDate;
	}
	
	public double getFine() {
		return fine;
	}
	
	public void setFine(double fine) {
		this.fine = fine;
	}
	
	public String toString() {
        return String.format("%-30s%-20s%d", title, author, yearPublished);
    }

	public String toStringRent() {
        return String.format("%-30s%-20s%-10sDue date: %-15sReturned Date: %-15sFine: %-10.2f", title, author, yearPublished, dueDate, returnedDate, fine);
    }

}