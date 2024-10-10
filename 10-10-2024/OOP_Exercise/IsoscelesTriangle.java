package OOP_Exercise;

public class IsoscelesTriangle extends Triangle {
	
	public IsoscelesTriangle(double sides, double base) {
		super(sides, base);
	}
	
	@Override
	public double calculateArea() {
		return ((0.5) * Math.sqrt(Math.pow(super.getSides(),  2) - 
				Math.pow(super.getBase(), 2) / 4) * super.getBase());
	}
	
	@Override
	public double calculatePerimeter() {
		return (super.getBase() + (2 * super.getSides()));
	}
	
	public String toString() {
		return "Sides: "+ super.getSides() +"\n"
				+ "Base: "+ super.getBase();
	}
}
