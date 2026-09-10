package exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IoExample {
    public void readFirstLine(String filePath) {
        // Try-with-resources automatically closes the BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            System.out.println("First line: " + line);
        } catch (IOException e) {
            // Handle external failure (missing file, unreadable drive, network drop)
            System.err.println("Failed to read file at path: " + filePath);
            e.printStackTrace();
        }
    }
}

