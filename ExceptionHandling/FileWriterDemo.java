import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    // Method to write content to a file with proper exception handling
    public static void writeToFile(String filename, String content) {
        FileWriter writer = null; // Declared outside try so finally block can access it

        try {
            writer = new FileWriter(filename, java.nio.charset.StandardCharsets.UTF_8);
            writer.write(content);
            System.out.println("Content written to file successfully.");

        } catch (IOException e) {
            // User-friendly error message if writing fails
            System.out.println("Error writing to file: " + e.getMessage());

        } finally {
            // Always runs — ensures the writer is closed even if an exception occurred
            if (writer != null) {
                try {
                    writer.close();
                    System.out.println("File closed successfully.");
                } catch (IOException e) {
                    // Nested try-catch handles errors that occur while closing
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        // Test 1: Normal write to a valid file
        writeToFile("sample.txt", "Hello, this is the test content.");

        // Test 2: Invalid path to trigger IOException
        writeToFile("/invalid_path/sample.txt", "This should fail.");
    }
}
