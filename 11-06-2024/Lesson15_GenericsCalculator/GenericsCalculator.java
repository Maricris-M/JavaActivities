package Generics;

import java.text.DecimalFormat;

public class GenericsCalculator <T extends Number> {
	
	private T num_1;
	private T num_2;
	
	GenericsCalculator(T num_1, T num_2) {
		this.num_1 = num_1;
		this.num_2 = num_2;
	}
	
	public void calculate(String input) {
		DecimalFormat df = new DecimalFormat("0.00");
		switch (input.toUpperCase()) {
		case "A":
			System.out.println(num_1 + " + " + num_2 +" = " + df.format(num_1.doubleValue() + num_2.doubleValue()) +"\n");
			break;
		case "B":
			System.out.println(num_1 + " - " + num_2 +" = " + df.format(num_1.doubleValue() - num_2.doubleValue()) +"\n");
			break;
		case "C":
			System.out.println(num_1 + " * " + num_2 +" = " + df.format(num_1.doubleValue() * num_2.doubleValue()) +"\n");
			break;
		case "D":
			System.out.println(num_1 + " / " + num_2 +" = " + df.format(num_1.doubleValue() / num_2.doubleValue()) +"\n");
			break;
		default:
			System.out.println("\nKindly choose from the menu.\n");
		}
	}

}
