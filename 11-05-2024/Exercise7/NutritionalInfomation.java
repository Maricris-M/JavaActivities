package Exercise7;

import java.util.Scanner;

import exception.InvalidFruitTypeException;

public class NutritionalInfomation {
	
	enum Fruits {
		APPLE(95, 7.9),
		BANANA(105, 9.1),
		ORANGE(63, 53.2);
		
		private int calories;
		private double vitaminC;

		Fruits(int calories, double vitaminC) {
			this.calories = calories;
			this.vitaminC = vitaminC;
		}
		
		public int getCalories() {
			return this.calories;
		}
		
		public double getVitaminC() {
			return this.vitaminC;
		}
	}
	
	class NutriFunction {
		public void display(String fruit) {
			Fruits type = Fruits.valueOf(fruit.toUpperCase());
			
			String fType = type.toString().toLowerCase();
			System.out.println("Nutritional Information for "+ fType +":");
			System.out.println("Calories: "+ type.getCalories());
			System.out.println("Vitamin C: "+ type.getVitaminC() +"\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean input = true;
		String fruitInput;
		InvalidFruitTypeException ex = new InvalidFruitTypeException("");
		NutritionalInfomation.NutriFunction nf = new NutritionalInfomation().new NutriFunction();
		
		do {
			try {
				System.out.print("Enter a fruit name (Apple, Banana, Orange): ");
				fruitInput = keyboard.next();
	
				if (fruitInput.equalsIgnoreCase("stop")) {
					input = false;
				} else {
					ex.validateFruit(fruitInput);
					nf.display(fruitInput);
				}
			} catch (InvalidFruitTypeException e) {
				System.err.println(e.getMessage());
			}
		} while(input);

	}

}
