/*
public class Classes {
    // Sqrt() calculation using Newton-Raphson method to demonstrate the while-loop
    // See https://en.wikipedia.org/wiki/Newton%27s_method or https://math.mit.edu/~stevenj/18.335/newton-sqrt.pdf

    private static double sqrt(double a) {
        double x = a/2;                       // Initial quess for the square root
        double eps = 4*Math.ulp(a);           // Check the accuracy of number representation

        while (Math.abs(x*x - a) >= eps) {    // Iterative algorithm until we have enough accuracy
            x = (a/x + x)/2;                  // Improve the estimate x for the square root
        }

        return (x);
    }

    private static double distance(int x1, int y1, int z1, int x2, int y2, int z2) {
        return (sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) + (z1-z2)*(z1-z2)));
    }

    public static void main(String[] args) {
        int x1, y1, z1;
        int x2, y2, z2;

        x1 = 11; y1 = 12; z1 = 13;  // Point 1
        x2 = 23; y2 = 24; z2 = 25;  // Point 2

        System.out.println("The distance between points is " + distance(x1, y1, z1, x2, y2, z2));
        System.out.println("The distance between point 1 and origin is " + distance(x1, y1, z1, 0, 0, 0));
        System.out.println("Two-dimensional distance between points is " + sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));
    }
}



public class Classes {
    // Sqrt() calculation using Newton-Raphson method to demonstrate the while-loop
    // See https://en.wikipedia.org/wiki/Newton%27s_method or https://math.mit.edu/~stevenj/18.335/newton-sqrt.pdf

    public static class Point {
        public int x, y, z;
    }

    private static double sqrt(double a) {
        double x = a/2;                       // Initial quess for the square root
        double eps = 4*Math.ulp(a);           // Check the accuracy of number representation

        while (Math.abs(x*x - a) >= eps) {    // Iterative algorithm until we have enough accuracy
            x = (a/x + x)/2;                  // Improve the estimate x for the square root
        }

        return (x);
    }

    private static double distance(Point p1, Point p2) {
        return (sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y) + (p1.z-p2.z)*(p1.z-p2.z)));
    }

    public static void main(String[] args) {
        Point p0 = new Point();
        Point p1 = new Point(), p2 = new Point();

        p1.x = 11; p1.y = 12; p1.z = 13;
        p2.x = 23; p2.y = 24; p2.z = 25;

        System.out.println("The distance between points is " + distance(p1, p2));
        System.out.println("The distance between point 1 and origin is " + distance(p1, p0));
        System.out.println("Two-dimensional distance between points is " + sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y)));
    }
}
*/

public class Classes {
    /* Sqrt() calculation using Newton-Raphson method to demonstrate the while-loop
     * See https://en.wikipedia.org/wiki/Newton%27s_method or https://math.mit.edu/~stevenj/18.335/newton-sqrt.pdf
     */
    public static class Point {
        public int x, y, z;

        public Point(int cx, int cy, int cz) {
            x = cx;
            y = cy;
            z = cz;
        }
        public double distance(Point p) {
            return (Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y) + (z-p.z)*(z-p.z)));
        }
    }

    public static double sqrt(double a) {
        double x = a / 2;                       // Initial quess for the square root
        double eps = 4 * Math.ulp(a);           // Check the accuracy of number representation

        while (Math.abs(x*x - a) >= eps) {      // Iterative algorithm until we have enough accuracy
            x = (a/x + x)/2;                    // Improve the estimate x for the square root
        }

        return (x);
    }

    public static void main(String[] args) {
        Point p0 = new Point(0, 0, 0);
        Point p1 = new Point(11, 12, 13);
        Point p2 = new Point(23, 24, 25);

        System.out.println("The distance between points 1 and 2 is " + p1.distance(p2));
        System.out.println("The distance between point 1 and origin is " + p1.distance(p0));
    }
}