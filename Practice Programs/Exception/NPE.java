package exceptions;

public class NPE {
	    public static void main(String[] args) {
	        String text = null; // The reference points to nothing

	        // This line will crash the program with a NullPointerException
	        int length = text.length(); 
	        
	        System.out.println("Text length is: " + length);
	    }
}
