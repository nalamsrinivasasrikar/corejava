package exceptions;

public class NFE {
	    public static void main(String[] args) {
	        String invalidInput = "100g";
	        int number;

	        try {
	            number = Integer.parseInt(invalidInput);
	            System.out.println("Parsed number: " + number);
	        } catch (NumberFormatException e) {
	            // Handle the exception gently
	            number = 20; 
	            	        }
	        
	        // Program continues safely
	        System.out.println("Final number value: " + number);
	    }
	}

