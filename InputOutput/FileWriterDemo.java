import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    // Method to write content to a file
    public static void writeToFile(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeToFile("sample.txt", "Hello, this is the test content.");
    }
}