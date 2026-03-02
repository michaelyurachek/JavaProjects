// Derived class for school-specific tasks
public class SchoolTask extends Task {
    private int meetingCount;  // Number of meetings for this task
    private String deadline;   // Deadline date

    // Constructor initializes base class attributes + school-specific attributes
    public SchoolTask(String name, double duration, String priorityLevel,
                      int meetingCount, String deadline) {
        super(name, duration, priorityLevel); // Call base class constructor
        this.meetingCount = meetingCount;
        this.deadline = deadline;
    }

    // Override printInfo to include meetings and deadline
    @Override
    public void printInfo() {
        super.printInfo(); // Print base task info
        System.out.println("Number of Meetings: " + meetingCount);
        System.out.println("Deadline: " + deadline);
    }
}