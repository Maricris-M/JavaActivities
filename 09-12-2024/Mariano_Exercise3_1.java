package JavaActivities;

import java.util.Arrays;

public class Mariano_Exercise3_1 {

	public static final int ARRAY_SIZE = 10;
	
	public static void main(String[] args) {
		double[] array = new double[ARRAY_SIZE];
		Arrays.fill(array, 0);
		
		System.out.println("Value of array index 4: "+ array[4]); 
		array[9] = 1.667;
		array[6] = 3.333;
		
		int sum = 0;
		for (int x = 0; x < array.length; x++) {
			sum += array[x];
		}
		
		System.out.println("Sum: "+ sum);	
	}
}
