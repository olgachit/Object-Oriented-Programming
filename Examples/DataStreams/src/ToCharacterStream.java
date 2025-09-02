import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ToCharacterStream {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("file.txt")) {
            String text = "Hello, World!";
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
