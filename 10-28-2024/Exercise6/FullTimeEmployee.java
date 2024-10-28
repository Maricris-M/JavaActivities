package Exercise6;

public class FullTimeEmployee extends Employee {
	
	private double monthlySalary = 20000;

	public FullTimeEmployee(String name, int employeeid, double hourlyRate) {
		super(name, employeeid, 0);
	}

	@Override
	public double calculatePay() {
		return monthlySalary;
	}

}
