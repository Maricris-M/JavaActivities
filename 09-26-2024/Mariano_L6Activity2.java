package Activity6;

public class Mariano_L6Activity2 {
	
	static int total = 0;
	static int[]indexValue = new int[7];

	public static void main(String[] args) {
		int[] listOfEmployees = {7,7,8,9,5,10};
		int targetHours = 8;

		getIndex(listOfEmployees, targetHours);
		System.out.println("Total employees who met the target: "+ total);
		
		for (int i = 0; i < indexValue.length - 1; i++) {
			if (indexValue[i] > 0) {
				System.out.println("Employee "+ i +" worked for "+ listOfEmployees[i] +" and met the target.");
			}
		}
	}
	
	public static void getIndex(int[] arr, int targetHours) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] >= targetHours) {
				total++;
				indexValue[i] = arr[i];
			}
		}
	}
}