
class Shape {
    public final static double PI = 3.14159; 

    public Shape() {
        System.out.println("Shape Calculator Initialized");
    }
    public double calculateArea(double side) {
        return side * side;
    }
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    public double calculateArea(int radius) {
        return PI * radius * radius;
    }
}
public class ShapeCalculator {
    public static void main(String[] args) {
       
        Shape shape = new Shape();
double squareArea = shape.calculateArea(5);                        
double rectangleArea = shape.calculateArea(5, 10);       
double circleArea = shape.calculateArea(7);              
      
        System.out.println("Area of square (side = 5): " + squareArea);
        System.out.println("Area of rectangle (5 x 10): " + rectangleArea);
        System.out.println("Area of circle (radius = 7): " + circleArea);
    }
}
