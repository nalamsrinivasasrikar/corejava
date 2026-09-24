package TaskFour;
import java.util.Scanner;
class Student {
    // Data members
    private int rollNo;
    private String name;
    private int[] marks;
    // Constructor to initialize student details
    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    // Method to calculate total marks
    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    // Method to calculate average marks
    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }
   // Method to calculate percentage 
    public double calculatePercentage() {
        int totalMaxMarks = marks.length * 100;
        return ((double) calculateTotal() / totalMaxMarks) * 100;
    }
    // Method to find highest marks using Math.max()
    public int findHighest() {
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            highest = Math.max(highest, marks[i]);
        }
        return highest;
    }
    // Method to find lowest marks using Math.min()
    public int findLowest() {
        int lowest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            lowest = Math.min(lowest, marks[i]);
        }
        return lowest;
    }
    // Method to determine grade based on percentage
    public String determineGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }
    // Method to determine pass/fail status
    public String getResultStatus() {
        return calculatePercentage() >= 50 ? "PASS" : "FAIL";
    }
    // Method to generate performance remark based on percentage
    public String getPerformanceRemark() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return "Outstanding Performance!";
        else if (percentage >= 80) return "Excellent Work!";
        else if (percentage >= 70) return "Good job, room for improvement.";
        else if (percentage >= 60) return "Satisfactory performance.";
        else if (percentage >= 50) return "Needs More Effort.";
        else return "Needs Immediate Improvement.";
    }
    // Method to display student details and analysis report
    public void displayReport() {
        // Rounding percentage to 2 decimal places using Math package
        double rawPercentage = calculatePercentage();
        double roundedPercentage = Math.round(rawPercentage * 100.0) / 100.0;
        System.out.println("          STUDENT ACADEMIC REPORT             ");
        System.out.println("Roll Number        : " + rollNo);
        System.out.println("Student Name       : " + name + " (Length: " + name.length() + " chars)");
        System.out.print("Marks Obtained     : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Total Marks        : " + calculateTotal() + " / " + (marks.length * 100));
        System.out.println("Average Marks      : " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest Subject    : " + findHighest());
        System.out.println("Lowest Subject     : " + findLowest());
        System.out.println("Percentage         : " + roundedPercentage + "%");
        System.out.println("Grade              : " + determineGrade());
        System.out.println("Result             : " + getResultStatus());
        System.out.println("Performance Remark : " + getPerformanceRemark());
    }
}

public class StudentPerformanceAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Enter Student Details ===");
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
 // Object creation
        Student student = new Student(rollNo, name, marks);
        // Display report
        student.displayReport();
        scanner.close();
    }
}
