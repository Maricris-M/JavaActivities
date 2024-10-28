package Exercise6;

public class Main {

	public static void main(String[] args) {
		FullTimeEmployee fullTime = new FullTimeEmployee("Juan", 1234, 0);
		PartTimeEmployee partTime = new PartTimeEmployee("John", 2345, 400);
		Contractor contractor = new Contractor("Jenn", 3456, 300);
		
		System.out.println("--- Full Time Employee ---");
		System.out.println("Name: " + fullTime.getName());
		System.out.println("Employee ID: " + fullTime.getEmployeeid());
		System.out.println("Salary: " + fullTime.calculatePay() +"\n");
		
		System.out.println("--- Part Time Employee ---");
		System.out.println("Name: " + partTime.getName());
		System.out.println("Employee ID: " + partTime.getEmployeeid());
		System.out.println("Salary: " + partTime.calculatePay() +"\n");
		
		System.out.println("--- Contractor ---");
		System.out.println("Name: " + contractor.getName());
		System.out.println("Employee ID: " + contractor.getEmployeeid());
		System.out.println("Salary: " + contractor.calculatePay());
	}
}
