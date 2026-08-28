package exceptions;

	public class TryAndCatch {
	   public static void main(String[] args) {
	   int i = 10,j = 0;
	   try {
	   int k = i/j;
	   System.out.println("value of k is " + k);
	   }catch(ArithmeticException ae){
	       System.out.println("give only non zero numbers");
	   }    
	   System.out.println("this is try and catch");
	}
	}
