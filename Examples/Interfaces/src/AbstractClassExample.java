// Abstract class
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method
    abstract double calculateArea();

    // Regular method
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Subclass
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass
class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 3.0);
        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());

        Square square = new Square("Blue", 4.0);
        square.displayColor();
        System.out.println("Square Area: " + square.calculateArea());
    }
}