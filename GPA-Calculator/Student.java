import java.util.Scanner;

public class Student {
    // (Encapsulation)
    // Private attributes
    private String firstName;
    private String lastName;
    private double gpa;

    // Constructor to initialize student object
    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGpa(gpa);
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter method with validation
    // Ensures GPA is between 0.0 and 4.0
    public void setGpa(double gpa) {
        if (gpa < 0.0) {
            this.gpa = 0.0;
        } else if (gpa > 4.0) {
            this.gpa = 4.0;
        } else {
            this.gpa = gpa;
        }
    }

    // toString method to return student information
    @Override
    public String toString() {
        return firstName + " " + lastName + " GPA: " + gpa;
    }

    // Main method to interact with user and manage students
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        // Create an array of Student objects
        Student[] students = new Student[numStudents];

        // Gather student data
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter first name of student #" + (i + 1) + ": ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name of student #" + (i + 1) + ": ");
            String lastName = scanner.nextLine();

            System.out.print("Enter GPA for student #" + (i + 1) + ": ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(firstName, lastName, gpa);
        }

        // Display student information and calculate average GPA
        double totalGpa = 0.0;

        for (Student student : students) {
            System.out.println(student.toString());
            totalGpa += student.getGpa();
        }

        // Calculate and display average GPA rounded to two decimal places
        double averageGpa = totalGpa / numStudents;
        System.out.printf("AVERAGE GPA: %.2f%n", averageGpa);

        // Close scanner
        scanner.close();
    }
}