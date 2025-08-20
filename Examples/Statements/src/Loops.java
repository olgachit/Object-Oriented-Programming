import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());
//while
        while (number != 0) {
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is not positive.");
            }
            System.out.println("Give another number:");
            number = Integer.parseInt(scanner.nextLine());
        }
/*
        //do while
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Give a number:");
            number = Integer.parseInt(scanner.nextLine());

            if (number > 0) {
                System.out.println("The number is positive.");
            }
            else if (number < 0) {
                System.out.println("The number is not positive.");
            }
        } while (number != 0);

        //for
        int i;

        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println(i);
         */
    }
}