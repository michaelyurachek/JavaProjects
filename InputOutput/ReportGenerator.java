import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReportGenerator {

    // Method to generate a formatted report
    public static void generateReport(String filename, List<String[]> data) {
        try {
            PrintWriter writer = new PrintWriter(filename);

            // Print header row
            String[] header = data.get(0);
            writer.printf("%-5s %-20s %-15s %-10s\n", header[0], header[1], header[2], header[3]);

            // Divider line
            writer.println("-------------------------------------");

            // Print data rows
            for (int i = 1; i < data.size(); i++) {
                String[] row = data.get(i);
                writer.printf("%-5s %-20s %-15s %-10s\n", row[0], row[1], row[2], row[3]);
            }

            // Footer divider
            writer.println("-------------------------------------");

            // Date/time footer
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");

            writer.println("Generated on: " + now.format(formatter));

            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while generating the report.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        List<String[]> data = List.of(
            new String[]{"ID", "Name", "Role", "Salary"},
            new String[]{"1", "Alice Smith", "Developer", "$80000"},
            new String[]{"2", "Bob Johnson", "Manager", "$95000"},
            new String[]{"3", "Charlie Lee", "Analyst", "$70000"}
        );

        generateReport("report.txt", data);
    }
}