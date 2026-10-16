package recordprog;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
public class Experiment13 {
    private static final String[] PHONE = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer("");
        for (int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            if (ch < '2' || ch > '9') {
                throw new IllegalArgumentException(
                    "Enter digits from 2 to 9 only."
                );
            }
            int digit = ch - '0';
            String letters = PHONE[digit];
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String current = queue.poll();
                for (int k = 0; k < letters.length(); k++) {
                    queue.offer(current + letters.charAt(k) );
                }
            }
        }
        Set<String> unique = new LinkedHashSet<>(queue);
        result.addAll(unique);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String digits = sc.nextLine().trim();

        try {
            List<String> combinations =
                letterCombinations(digits);

            System.out.println("Letter combinations: " + combinations);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

