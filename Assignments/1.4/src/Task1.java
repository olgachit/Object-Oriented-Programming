import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] firstNames = {"Oliver", "Louise", "Daniel", "Aiden", "Reece", "Matilda", "Tilly", "Keira", "Aimee", "Jessie"};
        String[] lastNames = {"Ward", "James", "Cameron", "Foster", "Harvey", "Murray", "Thompson", "Moore", "Russell", "Price"};
        while(true){
            System.out.println("Enter the number of names wanted up to 10");
            int num = Integer.parseInt(input.nextLine());

            if(num == 0){
                System.out.println("No names generated");
                break;
            }

            if (num>10 || num<1){
                System.out.println("Please enter a number between 1 and 10");
                continue;
            }

            for (int i=0; i<num; i++){
                int randomNum1 = (int)(Math.random() * 10);
                int randomNum2 = (int)(Math.random() * 10);
                String firstName = firstNames[randomNum1];
                String lastName = lastNames[randomNum2];
                System.out.printf("%d. First Name: %s, Last Name: %s\n", i+1, firstName, lastName);
            }
            break;
        }
    }
}
