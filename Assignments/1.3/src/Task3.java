import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start;
        int end = 0;

        while (true) {
            System.out.print("Enter a positive starting number: ");
            start = Integer.parseInt(input.nextLine());

            if (start > 0) {
                break;
            } else {
                System.out.println("Number must be a positive integer.");
            }
        }

        while (true) {
            System.out.print("Enter a positive ending number: ");
            end = Integer.parseInt(input.nextLine());
            if (end <= 0) {
                System.out.println("Number must be a positive integer.");
            } else if (end <= start) {
                System.out.println("Invalid range.");
            } else {
                break;
            }
        }
        System.out.printf("Prime numbers from %d to %d are: ", start, end);
        for (int i = start ; i <= end; i++) {
            boolean isPrime = true;

            if (i == 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

