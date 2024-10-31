package Lesson13;

public class Dog {
	
	Size dogSize;
	
	enum Size {
		SMALL, MEDIUM, LARGE, XLARGE, TINY;
	}
	
	Dog(Size dogSize) {
		this.dogSize = dogSize;
	}
	
	void selectDogSize() {
		String dogS = dogSize.toString();
	
		if (dogS.equals("TINY")) {
			System.out.println("I don't know which you like.");
		} else {
			if (dogS.equals("XLARGE")) {
				dogS = "EXTRA LARGE";
			}
			System.out.println("I am a "+ dogS.toLowerCase() +" doggy.");
		}
	}
	
}
