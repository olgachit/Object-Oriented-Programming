import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight in grams: ");
        double weight = Double.parseDouble(input.nextLine());
        double luoti = weight/13.28;
        int naula = (int)luoti/32;
        int leiviska = naula/20;
        System.out.println("Weight (g): " + weight);
        System.out.println(weight + " grams is " + leiviska + " leiviskä, " + naula + " naula and " + luoti + " luoti.");
    }
}
