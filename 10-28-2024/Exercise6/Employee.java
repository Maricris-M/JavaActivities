package Exercise6;

public abstract class Employee {
	private String name;
	private int employeeid;
	private double hourlyRate;
	
	public Employee(String name, int employeeid, double hourlyRate) {
		this.name = name;
		this.employeeid = employeeid;
		this.hourlyRate= hourlyRate;
	}
	
	public abstract double calculatePay();
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
}
