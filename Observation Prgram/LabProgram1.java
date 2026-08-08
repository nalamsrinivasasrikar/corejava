package observationtasks;
import java.util.Scanner;

class Student {
    String name;
    int rollno;
    int marks1, marks2, marks3;
    int total;
    double percentage;

    Scanner sc = new Scanner(System.in);

    void details() {
        System.out.println("\n--- Student Details ---");

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();

        System.out.print("Enter Marks 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        marks3 = sc.nextInt();
    }

    void sum() {
        total = marks1 + marks2 + marks3;
        percentage = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);
    }

    void display() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollno);
        System.out.println("Marks 1     : " + marks1);
        System.out.println("Marks 2     : " + marks2);
        System.out.println("Marks 3     : " + marks3);
        System.out.println("Total       : " + total);
        System.out.println("Percentage  : " + percentage);
    }
}

public class LabProgram1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        int choice;

        do {
            System.out.println("\n--- Student Utility Program ---");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Calculate Total and Percentage");
            System.out.println("3. Show Result");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    st.details();
                    break;

                case 2:
                    st.sum();
                    break;

                case 3:
                    st.display();
                    break;

                case 4:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}



