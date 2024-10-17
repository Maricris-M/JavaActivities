package JavaExercise5;

import java.io.*;
import java.util.*;

public class StudentPoll {

	public static Formatter formatter;
	
	public static void main(String[] args) throws IOException {
		int userInput = 1;
		System.out.println("WELCOME TO SURVEY RESPONSES");
		getUserInput(userInput);
		outputToFile();
	}
	
	public static void getUserInput(int userInput) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		formatter = new Formatter("C:\\Users\\maricris.mariano\\eclipse-workspace\\Mariano_JavaExercise5\\src\\JavaExercise5\\numbers.txt");

		while (userInput > 0 && userInput <= 10) {
			System.out.print("Enter survey response from 1-10: ");
			userInput = keyboard.nextInt();
			
			if (userInput > 0 && userInput <= 10) {
				formatter.format("%d\n", userInput);
				formatter.flush();
			}
		}
		keyboard.close();
	}
	
	public static void outputToFile() throws IOException {
		formatter = new Formatter("C:\\Users\\maricris.mariano\\eclipse-workspace\\Mariano_JavaExercise5\\src\\JavaExercise5\\output.txt");
		Scanner sc = new Scanner(new File("C:\\Users\\maricris.mariano\\eclipse-workspace\\Mariano_JavaExercise5\\src\\JavaExercise5\\numbers.txt"));

		while (sc.hasNextLine()) {
			formatter.format("%s\n", sc.nextLine());
			formatter.flush();
		}
		sc.close();
	}

}
