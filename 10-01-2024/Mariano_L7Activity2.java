package L7Activity;

public class Mariano_L7Activity2 {

	public static void main(String[] args) {
		Passenger passenger = new Passenger("Victor Magtatanggol", 'M', "Canadian", "June 12, 1898");
		System.out.println(passenger.toString());
		
		passenger = new Passenger("Vicky Manananggal", 'F', "Canadian", "June 12, 1898", 1234567890);
		System.out.println(passenger.toString());
	}
}