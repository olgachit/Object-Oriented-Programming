import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Buffer {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("file.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();  // Write a new line
            bufferedWriter.write("This is an example of BufferedWriter.");

            // It is important to flush or close the writer to ensure the data is written to the file
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}