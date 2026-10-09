package recordprog;
import java.util.Scanner;
interface Payable {
    void displaySalaryDetails();
}
class RegularEmployee implements Payable {
    private static final int BASIC_PAY = 25000;
    private static final int HRA = 15000;
    private static final int TA = 5000;
    public void displaySalaryDetails() {
        System.out.printf("Basic Pay: %d%nHRA: %d%nTA: %d%nTotal Amount: %d%n",
                BASIC_PAY, HRA, TA, BASIC_PAY + HRA + TA);
    }
}
class ContractEmployee implements Payable {
    private static final int BASIC_PAY = 12000;
    private static final int TA = 3000;
    public void displaySalaryDetails() {
        System.out.printf("Basic Pay: %d%nHRA: 0%nTA: %d%nTotal Amount: %d%n",
                BASIC_PAY, TA, BASIC_PAY + TA);
    }
}
public class Experiment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID (R for Regular, C for Contract): ");
        String type = scanner.nextLine().trim().toUpperCase();
        Payable employee = type.startsWith("C") ? new ContractEmployee() : new RegularEmployee();
        employee.displaySalaryDetails();
        scanner.close();
    }
} 
