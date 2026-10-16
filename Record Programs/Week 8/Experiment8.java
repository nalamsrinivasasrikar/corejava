package recordprog;
import java.util.Scanner;
interface Pay {
    void displaySalaryDetails();
}
class Regular implements Pay {
    private static final int BASIC_PAY = 25000;
    private static final int HRA = 15000;
    private static final int TA = 5000;
    @Override
    public void displaySalaryDetails() {
        System.out.printf(
            "Basic Pay: %d%nHRA: %d%nTA: %d%nTotal Amount: %d%n", BASIC_PAY, HRA, TA, BASIC_PAY + HRA + TA);
    }
}
class Contract implements Pay {
    private static final int BASIC_PAY = 12000;
    private static final int TA = 3000;
    @Override
    public void displaySalaryDetails() {
        System.out.printf( "Basic Pay: %d%nHRA: 0%nTA: %d%nTotal Amount: %d%n", BASIC_PAY, TA, BASIC_PAY + TA);
    }
}
public class Experiment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter employee ID (R for Regular, C for Contract): ");
        String type = scanner.nextLine().trim().toUpperCase();
        if (type.equals("R")) {
            Pay employee = new Regular();
            employee.displaySalaryDetails();
        } else if (type.equals("C")) {
            Pay employee = new Contract();
            employee.displaySalaryDetails();
        } else {
            System.out.println("Invalid input! Please enter R or C.");
        }
        scanner.close();
    }
}