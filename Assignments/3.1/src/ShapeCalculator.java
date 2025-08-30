public class ShapeCalculator {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0]= new Shape.Circle(5.0, "Red");
        shapes[1] = new Shape.Rectangle(4.0, 6.0, "Blue");
        shapes[2] = new Shape.Triangle(3.0, 8.0, "Green");

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape + ": " + shape.calculateArea());
        }
    }
}
