package recordprog;
import java.util.Scanner;

public class  Experiment3{
	void checkprime(int num) {
		boolean x=true;
		if(num<0 || num==0) {
			System.out.println("the check for ZER or negative INVALID");
		}
		else if(num==1) {
		    System.out.println("The number is not a Prime Palindrome");
		    return;
		}
		
		else {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("the number is not a primepalindrome");
				x=false;
				break;
			}
		}
		
		}
		if(x) {
			check(num);
		}
	}
	void check(int n) {
		int real=n;
		int rev=0,r;
		while(n>0) {
		r=n%10;
		n=n/10;
		rev=rev*10+r;
		}
		if(rev==real) {
			System.out.println("the given number is a primepalindrome");
		}
		else {
			System.out.println("tehe number is prime but not a palindrome");
		}
	}
public static void main(String[] args) {
	int number;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number you wanna check for a primepalindrome");
	number =sc.nextInt();
	Experiment3 e=new Experiment3();
	e.checkprime(number);
}
}
