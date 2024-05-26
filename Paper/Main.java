// Q4
import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private String branch;
    private static int numberOfStudents = 0;

    // Constructor to initialize the student attributes
    public Student(int rollNo, String name, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        numberOfStudents++; // Increment the count when a new student is created
    }

    // Method to get data from the user
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll No:");
        rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter Name:");
        name = scanner.nextLine();
        System.out.println("Enter Branch:");
        branch = scanner.nextLine();
    }

    // Method to display the student data
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
    }

    // Method to get the number of students created till now
    public static int getNumberOfStudents() {
        return numberOfStudents;
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student1 = new Student(1, "John Doe", "Computer Science");

        // Displaying the details of the first student
        System.out.println("Details of Student 1:");
        student1.display();

        // Getting data for a new student
        Student student2 = new Student(0, "", ""); // Creating an instance with default values
        System.out.println("\nEnter details for Student 2:");
        student2.getData();

        // Displaying the details of the second student
        System.out.println("\nDetails of Student 2:");
        student2.display();

        // Displaying the number of students created till now
        System.out.println("\nNumber of students created till now: " + Student.getNumberOfStudents());
    }
}