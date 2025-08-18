import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = Double.parseDouble(input.nextLine());
        double celsius = (temperature - 32) * 5 / 9;
        System.out.printf("The temperature in Celsius is: %.1f\n", celsius);
    }
}
