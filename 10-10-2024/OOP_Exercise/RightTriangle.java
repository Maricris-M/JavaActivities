package OOP_Exercise;

public class RightTriangle extends Triangle {
	private double height;

	public RightTriangle(double s, double b, double h) {
		super(s, b);
		this.height = h;
	}
	
	@Override
	public double calculateArea() {
		return ((super.getBase() * height) / 2);
	}
	
	@Override
	public double calculatePerimeter() {
		return (super.getSides() + super.getBase() + height);
	}
	
	public String toString() {
		return "Sides: "+ super.getSides() +"\n"
				+ "Base: "+ super.getBase() +"\n"
				+ "Height: "+ height +"";
	}
}
