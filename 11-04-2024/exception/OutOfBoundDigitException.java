package exception;

public class OutOfBoundDigitException extends Exception {

	private static final long serialVersionUID = 1L;

	public OutOfBoundDigitException(String message) {
		super(message);
	}
	
	public static void validateDigits(long number) throws OutOfBoundDigitException {
		String str;
		int str_length;
		boolean isValid = false;
		
		// converts long to string
		str = Long.toString(number);
		
		// finds the length of the converted string
		str_length = str.length();
		
		// checks if length of inputed number is equals to 10.If true, update the isValid true.
		if (str_length ==  10) {
			isValid = true;
		} else {
			// throw the exception
			throw new OutOfBoundDigitException("Invalid phone number! Only 10-digit number is allowed.");
		}	
	}
	
}
