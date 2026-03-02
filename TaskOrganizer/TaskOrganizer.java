import java.util.Scanner;

// Main program to organize tasks
public class TaskOrganizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For user input

        // Ask user how many tasks to input
        System.out.print("How many tasks would you like to input? ");
        int numTasks = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        Task[] tasks = new Task[numTasks]; // Array to hold all tasks

        double totalHours = 0; // Track total time for all tasks
        double schoolTotal = 0; // Track total time for school tasks
        double homeTotal = 0;   // Track total time for home tasks

        // Loop to input each task
        for (int i = 0; i < numTasks; i++) {
            System.out.println("\nTask " + (i + 1) + ":");

            System.out.print("Enter the name of the task: ");
            String name = scanner.nextLine();

            System.out.print("Enter the duration of the task (in hours): ");
            double duration = scanner.nextDouble();
            scanner.nextLine(); // Clear newline

            System.out.print("Enter the priority level (low, medium, high): ");
            String priority = scanner.nextLine();

            System.out.print("Is this a school task or a home task? ");
            String type = scanner.nextLine().toLowerCase();

            // Handle school tasks
            if (type.equals("school")) {
                System.out.print("Enter the number of meetings: ");
                int meetings = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter the deadline (e.g., '2025-10-12'): ");
                String deadline = scanner.nextLine();

                tasks[i] = new SchoolTask(name, duration, priority, meetings, deadline);
                schoolTotal += duration;

            } else { // Handle home tasks
                System.out.print("Enter the tools required for the task: ");
                String tools = scanner.nextLine();

                tasks[i] = new HomeTask(name, duration, priority, tools);
                homeTotal += duration;
            }

            totalHours += duration; // Add to total hours
        }

        System.out.println();

        // Print info for all tasks
        for (Task task : tasks) {
            task.printInfo();
            System.out.println();
        }

        // Display total hours
        System.out.printf("Total combined hours spent on tasks: %.2f%n", totalHours);

        // Compare total hours by task type
        if (schoolTotal > homeTotal) {
            System.out.printf("School tasks had the highest total duration: %.2f hours%n", schoolTotal);
        } else if (homeTotal > schoolTotal) {
            System.out.printf("Home tasks had the highest total duration: %.2f hours%n", homeTotal);
        } else {
            System.out.println("School and home tasks had equal total duration.");
        }

        System.out.println("Thank you for using the Task Organizer!");
        scanner.close(); // Close scanner
    }
}