import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first coefficient:");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("Enter the second coefficient:");
        int b = Integer.parseInt(input.nextLine());
        System.out.println("Enter the third coefficient:");
        int c = Integer.parseInt(input.nextLine());

        int bSquared = b*b;
        double discriminant = bSquared - (4*a*c);
        double root1 = (-b + Math.sqrt(discriminant))/(2*a);
        double root2 = (-b - Math.sqrt(discriminant))/(2*a);

        if (discriminant < 0) {
            System.out.println("No real roots");
        } else  {
            System.out.println("The roots of the equation are: " + root1 + " and " + root2);;
        }
    }
}
