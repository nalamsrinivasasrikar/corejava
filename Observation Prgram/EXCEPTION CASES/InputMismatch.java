package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter your age : ");
            try {
                age = scanner.nextInt();
                valid = true; // Input was valid, exit the loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a whole number");
                scanner.next(); 
            }
        }

        System.out.println("Your age is: " + age);
        scanner.close();
    }
}