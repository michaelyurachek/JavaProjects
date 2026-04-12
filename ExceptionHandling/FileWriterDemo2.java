import java.io.FileWriter;
import java.io.IOException;

// Custom checked exception for file write failures
class FileWriteException extends Exception {

    // Suppresses the serializable class warning required by -Xlint:all
    private static final long serialVersionUID = 1L;

    // Constructor accepts a message describing the error
    public FileWriteException(String message) {
        super(message);
    }
}

public class FileWriterDemo2 {

    // Method to write content to a file — throws FileWriteException on failure
    public static void writeToFile(String filename, String content) throws FileWriteException {
        FileWriter writer = null;

        try {
            writer = new FileWriter(filename, java.nio.charset.StandardCharsets.UTF_8);
            writer.write(content);
            System.out.println("Content written to file successfully.");

        } catch (IOException e) {
            // Wrap the IOException in our custom exception and propagate it up
            throw new FileWriteException(e.getMessage());

        } finally {
            if (writer != null) {
                try {
                    writer.close();
                    System.out.println("File closed successfully.");
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        // Test 1: Normal write — should succeed
        try {
            writeToFile("sample.txt", "Hello, this is the test content.");
        } catch (FileWriteException e) {
            System.out.println("Failed to write to file due to an error: " + e.getMessage());
        }

        // Test 2: Invalid path — triggers FileWriteException
        try {
            writeToFile("/invalid_path/sample.txt", "This should fail.");
        } catch (FileWriteException e) {
            System.out.println("Failed to write to file due to an error: " + e.getMessage());
        }
    }
}
