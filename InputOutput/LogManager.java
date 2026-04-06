import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LogManager {

    // Method to append a log entry
    public static void appendLog(String filename, String entry) {
        try {
            FileWriter fw = new FileWriter(filename, true); // append mode
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(entry);
            bw.newLine();
            bw.close();

            System.out.println("Log entry added.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the log.");
            e.printStackTrace();
        }
    }

    // Method to count number of log entries
    public static int getLogCount(String filename) {
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            while (reader.readLine() != null) {
                count++;
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the log.");
            e.printStackTrace();
        }

        return count;
    }

    public static void main(String[] args) {
        String filename = "activity.log";

        appendLog(filename, "User login at 10:00 AM");
        appendLog(filename, "File \"report.txt\" created at 10:05 AM");

        int totalLogs = getLogCount(filename);
        System.out.println("Total entries in log: " + totalLogs);
    }
}