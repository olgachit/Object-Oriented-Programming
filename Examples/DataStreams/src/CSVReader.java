import java.io.*;

public class CSVReader {
    private final static String FILENAME = "data.csv";
    public static void main(String[] args) {
        FileReader file;
        BufferedReader bufferedstream = null;
        String line;
        String[] columnNames = new String[0];
        boolean header = true;

        try {
            file = new FileReader(FILENAME);
            bufferedstream = new BufferedReader(file);

            do {
                line = bufferedstream.readLine();
                if (line != null) {
                    if (header) {
                        // first row of the file contains names of columns
                        columnNames = line.split(";");
                        header = false;
                    } else {
                        // just print data lines with column names
                        String[] columns = line.split(";");
                        for (int i = 0; i < columnNames.length; i++)
                            System.out.print(columnNames[i] + ": " + columns[i] + ", ");
                        System.out.println();
                    }
                }
            } while (line != null);
        } catch (IOException e) {
            // Error output, will print to console even in case of output redirection
            System.err.println(e);
        } finally {
            try {
                // we will close the stream only if we were able to open it
                if (bufferedstream != null)
                    bufferedstream.close();
            } catch (Exception e) {
                System.out.println("Error while closing the file " + FILENAME);
            }
        }
    }
}