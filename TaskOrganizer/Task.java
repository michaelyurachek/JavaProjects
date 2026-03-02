// Base class representing a generic task
public class Task {
    protected String name;          // Task name
    protected double duration;      // Duration in hours
    protected String priorityLevel; // Priority level (low, medium, high)

    // Constructor to initialize the task
    public Task(String name, double duration, String priorityLevel) {
        this.name = name;
        this.duration = duration;
        this.priorityLevel = priorityLevel;
    }

    // Returns the duration of the task
    public double getDuration() {
        return duration;
    }

    // Prints basic info about the task
    public void printInfo() {
        System.out.println("Task: " + name);
        System.out.printf("Duration: %.2f hours%n", duration);
        System.out.println("Priority Level: " + priorityLevel);
    }
}