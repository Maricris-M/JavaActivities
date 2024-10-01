package L7Activity;

import java.util.Arrays;

public class Mariano_L7Activity1 {

	public static void main(String[] args) {
		Passenger passenger = new Passenger();
		passenger.name = "Victor Magtatanggol";
		passenger.gender = 'M';
		passenger.nationality = "Canadian";
		passenger.dateOfBirth = "June 12, 1898";
		passenger.passport = new String[] {passenger.name, passenger.nationality, passenger.dateOfBirth};
	
		System.out.println(passenger.name);
		System.out.println(passenger.gender);
		System.out.println(passenger.nationality);
		System.out.println(passenger.dateOfBirth);
		System.out.println(Arrays.toString(passenger.passport));	
	}
}