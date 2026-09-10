package exceptions;

public class NPE {
	    public static void main(String[] args) {
	        String txt = null; // The reference points to nothing

	        // This line will crash the program with a NullPointerException
	        int length = txt.length(); 
	        
	        System.out.println("Text length is: " + length);
	    }
}
