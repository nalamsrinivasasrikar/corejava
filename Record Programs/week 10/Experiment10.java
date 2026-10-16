package recordprog;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class Experiment10 {
    public static void main(String[] args) {
  String text =
            "Peter Piper picked a peck of pickled peppers\n" +
            "A peck of pickled peppers Peter Piper picked\n" +
            "If Peter Piper picked a peck of pickled peppers\n" +
            "Where’s the peck of pickled peppers Peter Piper picked?";
        try {
            // Writing data into the file
            FileWriter writer = new FileWriter("sample.txt");
            writer.write(text);
            writer.close();
            // Reading data from the file
            FileReader reader = new FileReader("sample.txt");
            String content = "";
            int ch;
            while ((ch = reader.read()) != -1) {
                content += (char) ch;
            }
            reader.close();
            // Convert to lowercase for counting
            content = content.toLowerCase();
            int peCount = 0;
            int piCount = 0;
            // Count "pe"
            for (int i = 0; i < content.length() - 1; i++) {
                if (content.substring(i, i + 2).equals("pe")) {
                    peCount++;
                }
                if (content.substring(i, i + 2).equals("pi")) {
                    piCount++;
                }
            }
            System.out.println("'pe' - no of occurrences - " + peCount);
            System.out.println("'pi' - no of occurrences - " + piCount);
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

