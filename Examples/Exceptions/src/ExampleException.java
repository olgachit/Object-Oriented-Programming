public class ExampleException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            int result = numbers[4]; // Accessing an element outside the array bounds
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}