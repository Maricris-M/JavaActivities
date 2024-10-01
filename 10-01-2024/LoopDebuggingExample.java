package DebuggingExercises;

public class LoopDebuggingExample {

	public static void main(String[] args) {
		int n = 10;
		int sum = calculateSum(n);
		System.out.println("Sum: " + sum);
		
		int factorial = calculateFactorial(n);
		System.out.println("Factorial: "+ factorial);
		
		int fibonacci = calculateFibonacci(n);
		System.out.println("Fibonacci: " + fibonacci);
	}
	
	public static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i; // No. 1
		}
		return sum;
	}
	
	public static int calculateFactorial(int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i; // No. 2
		}
		return factorial;
	}
	
	public static int calculateFibonacci(int n) {
		int a = 0, b = 1, c;
		System.out.print("Fibonacci Series:" + a + " " + b);
		
		for (int i = 2; i <= n; i++) { // No. 6
			c = a + b; // No. 3
			System.out.print(" " + c);
			a = b; // No. 4
			b = c; // No. 5
		}
		return b;
	}
}
