package Generics;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double num1;
		double num2;

		System.out.print("1st Number: ");
		num1 = keyboard.nextDouble();
		
		System.out.print("2nd Number: ");
		num2 = keyboard.nextDouble();
		
		GenericsCalculator<Double> gM = new GenericsCalculator<Double>(num1, num2);
		
		do {
			System.out.println("[A] Addition"
					+ "\n[B] Subtraction"
					+ "\n[C] Multiplication"
					+ "\n[D] Division"
					+ "\n[E] Exit Program");
			
			System.out.print("Operation: ");
			String input = keyboard.next();
			
			if (input.equalsIgnoreCase("e")) {
				keyboard.close();
				System.out.println("\nThank you for using our calculator.");
				System.exit(0);
			} else {
				gM.calculate(input);
			}
		} while(true);
		
	}
}
