import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = reader.nextLine();

        System.out.println("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Hello, " + name + ", you are " + age + " years old" + "!");

        double f = 1.23;
        f++;
        System.out.println("floating point:" + f);
    }
}
