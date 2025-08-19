import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a value");
        String inputLine = input.nextLine();
        int Value = Integer.parseInt(inputLine);

        /*
        //Print two values, string and integer
        System.out.printf("The value of the variable is %s and it is also %d", inputLine, Value);
         */

        if (Value < 0) {
            System.out.println("The value is negative");
        } else if (Value == 0) {
            System.out.println("The value is zero");
        }  else {
            System.out.println("The value is positive");
        }
        System.out.println("The value is " + Value);

        if ((Value >= 1 && Value <= 9) || Value == -1) {
            System.out.println("The value is required");
        }
//In place of else if
        switch (Value) {
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            case 4:
                System.out.println("The value is 4");
                break;
        }
    }
}
