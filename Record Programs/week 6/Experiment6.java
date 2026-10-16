package recordprog;
import java.util.Scanner;

public class Experiment6 {

// Method to find longest substring
static void findLongestSubstring(String str) {

String longest = "";

for (int i = 0; i < str.length(); i++) {

    String current = "";

    for (int j = i; j < str.length(); j++) {

        char ch = str.charAt(j);

        // Check whether character is already present
        if (current.indexOf(ch) != -1) {
            break;
        }

        current = current + ch;

        // Update longest substring
        if (current.length() > longest.length()) {
            longest = current;
        }
    }
}

System.out.println("Longest substring: " + longest);
System.out.println("Length: " + longest.length());
}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter a string: ");
String str = sc.nextLine();

findLongestSubstring(str);

sc.close();
}
}
