public class Shape {
    public double calculateArea() {
        return 0.0;
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
        @Override
        public String toString() {
            return "Circle with radius " + radius;
        }
    }

    static class Rectangle extends Shape {
        private double width;
        private double height;
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
        @Override
        public String toString() {
            return "Rectangle with width " + width + " and height " + height;
        }
    }

    static class Triangle extends Shape {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }
        @Override
        public double calculateArea() {
            return ((double) 1 /2)*base * height;
        }
        @Override
        public String toString() {
            return "Triangle with base " + base + " and height " + height;
        }
    }
}


