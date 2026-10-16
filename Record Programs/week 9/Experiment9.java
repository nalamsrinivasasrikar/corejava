
package recordprog;
import java.util.Scanner;
public class Experiment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String input = sc.nextLine().trim().toUpperCase();
        try {
            if (input.isEmpty()) {
                throw new IllegalArgumentException(
                    "Roman numeral cannot be empty."
                );
            }
            Roman roman = new Roman();
            int result = roman.romanToInteger(input);
            System.out.println("Integer value: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
