public class Shape {
    private String colour;
    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public double calculateArea() {
        return 0.0;
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius, String colour) {
            super(colour);
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
        @Override
        public String toString() {
            return "Circle with radius " + radius + ", Colour " + getColour();
        }
    }

    static class Rectangle extends Shape {
        private double width;
        private double height;
        public Rectangle(double width, double height, String colour) {
            super(colour);
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
        @Override
        public String toString() {
            return "Rectangle with width " + width + " and height " + height + ", Colour " + getColour();
        }
    }

    static class Triangle extends Shape {
        private double base;
        private double height;

        public Triangle(double base, double height, String colour) {
            super(colour);
            this.base = base;
            this.height = height;
        }
        @Override
        public double calculateArea() {
            return ((double) 1 /2)*base * height;
        }
        @Override
        public String toString() {
            return "Triangle with base " + base + " and height " + height + ", Colour " + getColour();
        }
    }
}



