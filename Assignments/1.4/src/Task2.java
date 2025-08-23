import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = Integer.parseInt(input.nextLine());
        int[] array = new int[size];

        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter integer " + (i+1) + ":");
            array[i] = Integer.parseInt(input.nextLine());
        }
// maxSum = 0 does not work for negative arrays
        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;

        for (int i = 0; i <= size; i++) {
            int currentSum = 0;
            for (int j = i; j < size; j++) {
                currentSum += array[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = i+1;
                    end = j+1;
                }
            }
        }
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + start + "-" + end);
    }
}
