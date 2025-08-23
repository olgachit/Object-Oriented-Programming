import java.util.Scanner;

public class Task3 {
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

        int[] array2 = new int[size];
        int newSize = 0;

        for (int i = 0; i < size; i++) {
            boolean alreadyExists = false;
            for(int j = 0; j < newSize; j++){
                if (array[i]==array2[j]) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                array2[newSize]=array[i];
                newSize++;
            }
        }

        System.out.println("Array without duplicates: ");
        for (int i = 0; i < newSize; i++){
            System.out.print(array2[i] + " ");
        }
    }
}
