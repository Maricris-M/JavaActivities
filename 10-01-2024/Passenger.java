package L7Activity;

public class Passenger {
	
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport;
	public long pwdIDNumber; // Task 4 L7 Activity 2
	
	// Sample constructor
	public Passenger() {
		this.name = "Dan";
		this.gender = 'M';
		this.nationality = "Filipino";
		this.dateOfBirth = "June 1, 2000";
		this.passport = new String[] {name, nationality, dateOfBirth};
	}
	
	// Sample constructor with parameters
	public Passenger(String name, char gender, String nationality, String dateOfBirth, String[] passport) {
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.passport = passport;
	}
	
	// Task 1 L7 Activity 2
	public Passenger(String name, char gender, String nationality, String dateOfBirth) {
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
	}
	
	// Task 2 L7 Activity 2
	public String toString() {
		String pwdValue = "PWD ID No.: "+ this.pwdIDNumber;
		return("Name: "+ name +
				"\nGender: "+ gender + 
				"\nNationality: " + nationality +
				"\nDate of Birth: "+ dateOfBirth +
				"\n" + (this.pwdIDNumber == 0 ? "": pwdValue) +"\n");
	}
	
	// Task 4 L7 Activity 2
	public Passenger(String name, char gender, String nationality, String dateOfBirth, long pwdIDNumber) {
		this(name, gender, nationality, dateOfBirth);
		this.pwdIDNumber = pwdIDNumber;
	}
}