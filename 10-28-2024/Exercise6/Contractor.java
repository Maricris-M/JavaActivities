package Exercise6;

public class Contractor extends Employee {
	
	private int hoursWorked = 8;
	
	public Contractor(String name, int employeeid, double hourlyRate) {
		super(name, employeeid, hourlyRate);
	}

	@Override
	public double calculatePay() {
		return super.getHourlyRate() * hoursWorked;
	}
}
