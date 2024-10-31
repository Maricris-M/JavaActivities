package Lesson13;

import Lesson13.Dog.Size;

public class Main {
	public static void main(String[] args) {
		Dog myDog = new Dog(Size.TINY);
		myDog.selectDogSize();
	}
}