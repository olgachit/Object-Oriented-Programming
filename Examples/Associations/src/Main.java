import java.util.Scanner;

public class Main {
    public static void funfun(Car car) {
        System.out.println(car);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        new Car("314"); //Reserves space
        Car toyota = new Car("313");
        Car toyota2 = toyota;
        toyota = null; //Forgets previous value
        funfun(toyota);
        funfun(toyota2);
    }
}
