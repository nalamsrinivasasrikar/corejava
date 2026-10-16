package recordprog;
import java.util.Scanner;
class LengthNotSufficientException extends Exception {
    public LengthNotSufficientException(String message) {
        super(message);
    }
}
public class Experiment11 {
    public static void validateMobile(String mobile)
            throws LengthNotSufficientException {
        if (!mobile.matches("\\d+")) {
            throw new NumberFormatException(
                "Mobile number must contain digits only."
            );
        }
        if (mobile.length() < 10) {
            throw new LengthNotSufficientException(
                "Mobile number must contain 10 digits."
            );
        }
        if (mobile.length() > 10) {
            throw new ArrayIndexOutOfBoundsException(
                "Mobile number cannot contain more than 10 digits."
            );
        }
        System.out.println("Valid mobile number.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();
        try {
            validateMobile(mobile);
        } catch (LengthNotSufficientException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
