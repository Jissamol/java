import java.util.Scanner;


interface Shape {
    void draw();
}


class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing square");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing triangle");
    }
}


class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        switch (shapeType.toLowerCase()) {
            case "circle": return new Circle();
            case "square": return new Square();
            case "triangle": return new Triangle();
            default: return null;
        }
    }
}


public class ShapeFactoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter shape to draw (circle/square/triangle): ");
        String input = scanner.nextLine();

        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape(input);

        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Invalid shape.");
        }

        scanner.close();
    }
}
