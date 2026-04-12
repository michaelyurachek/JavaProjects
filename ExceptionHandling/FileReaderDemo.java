import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    // Method to read content from a file — IOException propagates to the caller
    public static void readFromFile(String filename) throws IOException {
        // try-catch removed; throws IOException in signature propagates the exception up
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }

    public static void main(String[] args) {
        // Test 1: Read a file that exists
        try {
            readFromFile("sample.txt");
        } catch (IOException e) {
            // Propagated IOException is caught here in main
            System.out.println("Error reading from file: " + e.getMessage());
        }

        // Test 2: File that does not exist — triggers propagated IOException
        try {
            readFromFile("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
