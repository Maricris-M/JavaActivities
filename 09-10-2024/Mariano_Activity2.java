package JavaActivities;

import java.util.*;

public class Mariano_Activity2 {
	
	static int numOfElements;
	static int[] arr;
	static int target;

	public static void main(String[] args) {
		getLength();
		getElements();
		
		int[] index = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					index[0] = i;
					index[1] = j;
				}
			}
		}
		
		if (index[0] == 0 && index[1] == 0) {
			System.out.println("No match is found.");
		} else {
			System.out.println(Arrays.toString(index));
		}
		System.exit(0);
	}
	
	public static void getLength() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("How many elements do you want to input? ");
			numOfElements = input.nextInt();
			
			if (numOfElements <= 2) {
				System.out.println("The number of elements should be greater then 2.");
			}
		} while (numOfElements <= 2);
	}
	
	public static void getElements() {
		Scanner input = new Scanner(System.in);
		arr = new int[numOfElements];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the element "+ i +" :");
			arr[i] = input.nextInt(); 
		}
		
		System.out.print("Enter the target value: ");
		target = input.nextInt();
	}

}
