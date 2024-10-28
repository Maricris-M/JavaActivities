package Exercise6;

public class PartTimeEmployee extends Employee {
	
	private int hoursWorked = 4;

	public PartTimeEmployee(String name, int employeeid, double hourlyRate) {
		super(name, employeeid, hourlyRate);
	}

	@Override
	public double calculatePay() {
		return super.getHourlyRate() * hoursWorked;
	}

}
