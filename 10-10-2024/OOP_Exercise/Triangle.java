package OOP_Exercise;

public class Triangle {
	private double sides;
	private double base;
	
	public Triangle (double s, double b) {
		this.sides = s;
		this.base = b;
	}
	
	public double getSides() {
		return sides;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setSides(double sides) {
		this.sides = sides;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double calculateArea() {
		return 0.0;
	}
	
	public double calculatePerimeter() {
		return 0.0;
	}
}
