package exceptions;

public class Arrayindexoutofboundexception {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		System.out.println("validnumber" +arr[2]);
		try {
			System.out.println("invalidnumber" +arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught exceptions:"+ e.getMessage());
			
		}
		System.out.println("The program is excutes smoothly");
	}
	}