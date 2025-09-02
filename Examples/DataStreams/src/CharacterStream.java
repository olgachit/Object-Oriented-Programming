import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharacterStream {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("file.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                // Process the character data
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
