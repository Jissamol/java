// Class representing a Circle
class Circle {
	// Field to store the radius of the circle
	private double radius;

	// Method to set the radius
	public void setRadius(double radius) {
		this.radius = radius;
		System.out.println("Radius set");
	}

	// Method to calculate and return the area of the circle
	public double calculateArea() {

		System.out.println("Area being Calculated");
		return Math.PI * radius * radius;
	}

	Circle()
	{
		System.out.println("Object Created");
	}

}

public class  circleArea{
	public static void main(String[] args) {
		// Create a Circle object
		Circle circle = new Circle();

		// Set the radius
		circle.setRadius(5.0);

		// Invoke the method to calculate area
		double area = circle.calculateArea();

		// Print the area
		System.out.println("Area of the circle: " + area);
	}

}

