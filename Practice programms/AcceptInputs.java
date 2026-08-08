package myprogs.basics;
import java.util.Scanner;

public class AcceptInputs {
	public static void main(String[] args) {
		System.out.println("Enter two numbers to add: "); 
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //typecasting
		int y = sc.nextInt();
		
		System.out.println("Reslut is: " + (x+y));
	}
}