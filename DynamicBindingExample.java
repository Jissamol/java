import java.util.Scanner;


class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}


class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}


class Square extends Shape {
    void draw() {
        System.out.println("Drawing square");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing triangle");
    }
}

public class DynamicBindingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter the shape to draw (circle, square, triangle): ");
        String shapeType = scanner.nextLine();

        Shape s; 


        if (shapeType.equalsIgnoreCase("circle")) {
            s = new Circle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            s = new Square();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            s = new Triangle();
        } else {
            System.out.println("Unknown shape. Drawing default shape.");
            s = new Shape();
        }

        s.draw(); 
        scanner.close();
    }
}
