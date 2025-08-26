import java.util.Scanner;

public class Main2 {
    public static void funfun(Car car) {
        System.out.println(car);
        car.accelerate();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        /*
        if (str == "Metropolia")
            System.out.println("Bingo");
        The input will be different object even if Metropolia is entered
         */

        if (str.equals("Metropolia"))
            System.out.println("Bingo");

        int a=1, b=2;
        if (a == b)
            System.out.println("hooray");

        Car byd = new Car("314");
        Car byd2 = new Car("314");

        if (byd == byd2)
            System.out.println("hooray"); //two different objects so there is no return value

        byd.fillTank();
        System.out.println("Speed is " + byd.getSpeed());
        funfun(byd);
        System.out.println("Speed is " + byd.getSpeed());
    }
}
