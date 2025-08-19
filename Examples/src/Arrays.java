import java.util.Scanner;

public class Arrays {
    public static int getNumber(Scanner scanner){
        System.out.print("Give value");
        String inputLine = scanner.nextLine();
        int value = Integer.parseInt(scanner.nextLine());
        return value;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The integers in reverse order:");

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        //iterating over arrays
        //reverse
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        //original order
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

        /*
        int[] t = new int[3];
        int t0 = 0, t1 = 0, t2 = 0, t3 = 0, t4 = 0;

        for (int i = 0; i <= 3; i++) {
            if (i==0){
                t0 = getNumber(input);
            } else if (i==1){
                t1 = getNumber(input);
            } else if (i==2){
                t2 = getNumber(input);
            }
        }
        for (int i = 0; i <= 3; i++) {
            if (i==0){
                System.out.println(t0);
            } else if (i==1){
                System.out.println(t1);
            } else if (i==2){
                System.out.println(t2);
            }
        }
        int[] numbers = { 1, -2, 14, -4, 0 };

        System.out.println(numbers[0]);
        System.out.println(numbers[4]);

 */

