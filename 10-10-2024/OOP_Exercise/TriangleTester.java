package OOP_Exercise;

public class TriangleTester {

	public static void main(String[] args) {
		RightTriangle rightTriangle = new RightTriangle(3.0, 4.0, 5.0);
		IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(3.0, 5.0);
		
		System.out.println("--- Right Triangle ---");
		System.out.println(rightTriangle.toString());
		System.out.println("Area: " + rightTriangle.calculateArea());
		System.out.println("Perimeter: " + rightTriangle.calculatePerimeter() +"\n");
		
		System.out.println("--- Isosceles Triangle ---");
		System.out.println(isoscelesTriangle.toString());
		System.out.println("Area: " + isoscelesTriangle.calculateArea());
		System.out.println("Perimeter: " + isoscelesTriangle.calculatePerimeter());

	}
}
