import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileDemo {

    // Method to write data to a CSV file
    public static void writeCSV(String filename, String[] headers, String[][] data) {

        try (FileWriter writer = new FileWriter(filename)) {
            // Write header row
            writer.write(String.join(",", headers) + "\n");

            // Write each data row
            for (String[] row : data) {
                writer.write(String.join(",", row) + "\n");
            }

            System.out.println("CSV file written successfully.");

        } catch (FileNotFoundException e) {
            // Triggered if the file path does not exist
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            // Triggered for any other I/O error during writing
            System.out.println("IO error encountered with the file: " + e.getMessage());
        }
    }

    // Method to read and display contents of a CSV file
    public static void readCSV(String filename) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            System.out.println("Reading CSV file: " + filename);

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            // Triggered if the specified file cannot be found
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            // Triggered for any other I/O error during reading
            System.out.println("IO error encountered with the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filename = "students.csv";

        String[] headers = {"ID", "Name", "Major", "GPA"};

        String[][] data = {
            {"1", "Alice Smith", "Computer Science", "3.8"},
            {"2", "Bob Johnson", "Mathematics", "3.5"},
            {"3", "Charlie Lee", "Physics", "3.7"}
        };

        // Test 1: Write CSV file successfully
        writeCSV(filename, headers, data);

        // Test 2: Read the CSV file back
        readCSV(filename);

        // Test 3: Attempt to read a file that does not exist (triggers FileNotFoundException)
        readCSV("nonexistent.csv");
    }
}
