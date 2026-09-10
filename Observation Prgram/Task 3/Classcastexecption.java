package exceptions;

public class Classcastexecption {
    public static void main(String[] args) {
        try {
            Object obj = "Java";
            Integer n = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Invalid type casting");
        }
    }
}