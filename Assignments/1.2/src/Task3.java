import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight in grams: ");
        double weight = Double.parseDouble(input.nextLine());
        /*
        This is not considering the remainders
        double luoti = weight/13.28;
        int naula = (int)luoti/32;
        int leiviska = naula/20;
         */

        double totalLuoti = weight/13.28;
        int leiviska = (int)totalLuoti/(32*20);
        double luoti = totalLuoti % (32 * 20);
        int naula = (int)(luoti / 32);
        luoti %= 32;

        System.out.println("Weight (g): " + weight);
        System.out.printf("%s grams is %d leiviskä, %d naula and %.2f luoti.%n", weight, leiviska, naula, luoti);
    }
}
