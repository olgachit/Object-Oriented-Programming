import java.util.Scanner;

public class Task4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int problems;
        int score = 0;
        while(true) {
            for(problems=1; problems<=10; problems++){
                int i = (int) (Math.random() * 10) + 1;
                int j = (int) (Math.random() * 10) + 1;
                System.out.printf("Problem #%d: %d x %d is?", problems, i, j);
                int answer = Integer.parseInt(input.nextLine());
                if(answer == i*j){
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect");
                }
            }
            System.out.println("You got " + score + " out of 10!");
            if(score == 10){
                System.out.println("Congratulations you mastered the multiplication table!");
                break;
            } else {
                System.out.println("Let's try again!");
            }
        }
    }
}

