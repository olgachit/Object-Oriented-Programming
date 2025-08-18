import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the conversion factor: ");
        final double CONVERSION_FACTOR = Double.parseDouble(scanner.nextLine());

        /* program code */

        scanner.close();
    }
}
