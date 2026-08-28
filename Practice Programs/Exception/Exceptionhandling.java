package exceptions;

public class Exceptionhandling {
		public static void main(String[] args) {
			int i=10,j=0;
			
			try {
				int k = i/j;
				System.out.println("Value of k is: " + k);
			}catch(ArithmeticException ae) {
				System.out.println("give only non zero numbers");
			}
			
			System.out.println("Imp lines");
			System.out.println("Very imp lines");
		}
	}
