package exception;

public class InvalidFruitTypeException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidFruitTypeException(String message) {
		super(message);
	}
		
	public static void validateFruit(String fruit) throws InvalidFruitTypeException {
		boolean isValid = false;
		if (fruit.equalsIgnoreCase("apple") || fruit.equalsIgnoreCase("banana") || fruit.equalsIgnoreCase("orange")) {
			isValid = true;
		} else {
			// throw the exception
			throw new InvalidFruitTypeException("Error: Invalid fruit name entered.");
		}	
	}
	
}
