package exceptions;
import java.io.*;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("abc.txt");
            //Handling missing or inaccessible files
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

