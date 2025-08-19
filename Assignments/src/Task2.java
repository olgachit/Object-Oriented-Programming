import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = input.nextLine();
        int max = binary.length()-1;
        int decimal = 0;
        for(int i = 0; i<=max; i++){
            int power = max-i;
            decimal += binary.charAt(i)*Math.pow(2, power);
        }
        System.out.println("Decimal: " + decimal);
    }
}
