import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("file.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Process the line of text
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}