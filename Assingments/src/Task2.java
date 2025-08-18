import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first length: ");
        double AB = Double.parseDouble(input.nextLine());
        System.out.println("Please enter the second length: ");
        double BC = Double.parseDouble(input.nextLine());
        double ABsquare = AB * AB;
        double BCsquare = BC * BC;
        double AC = Math.sqrt(ABsquare + BCsquare);
        System.out.printf("The hypotenuse of the triangle is %.2f\n", AC);
    }
}
