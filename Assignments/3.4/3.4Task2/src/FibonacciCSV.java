import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSV {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("fibonacci.csv")) {
            writer.append("Index,Fibonacci\n");

            long a = 0, b = 1;
            writer.append("0,").append(String.valueOf(a)).append("\n");
            writer.append("1,").append(String.valueOf(b)).append("\n");

            for (int i = 2; i < 60; i++) {
                long c = a + b;
                writer.append(String.valueOf(i))
                        .append(",")
                        .append(String.valueOf(c))
                        .append("\n");

                a = b;
                b = c;
            }

            System.out.println("Fibonacci sequence written to fibonacci.csv");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
