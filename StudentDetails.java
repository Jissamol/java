// Class representing a Student
class Student {
    // Properties of Student
    private String name;
    private int marks;

    // Method to set student details
    public void setDetails(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student();

        // Set student properties
        student.setDetails("Alice", 85);

        // Display student details
        student.displayDetails();
    }
}
