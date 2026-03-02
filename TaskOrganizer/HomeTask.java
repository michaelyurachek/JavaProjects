// Derived class for home-specific tasks
public class HomeTask extends Task {
    private String toolsRequired; // Tools needed for the task

    // Constructor initializes base class attributes + home-specific attribute
    public HomeTask(String name, double duration, String priorityLevel, String toolsRequired) {
        super(name, duration, priorityLevel);
        this.toolsRequired = toolsRequired;
    }

    // Override printInfo to include tools required
    @Override
    public void printInfo() {
        super.printInfo(); // Print base task info
        System.out.println("Tools Required: " + toolsRequired);
    }
}