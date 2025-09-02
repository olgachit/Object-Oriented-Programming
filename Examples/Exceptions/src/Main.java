import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("file.txt");
            // Perform operations with the file
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}