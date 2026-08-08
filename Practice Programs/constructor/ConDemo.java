package myprogs.basics;

public class ConDemo {
	int rollNo;
	String name;
	
//	constructor
	public ConDemo() {
		this.rollNo = 1234;
		this.name = "Suresh";
		System.out.println("Variables are ready");
	}
	
	void showDetails() {
		System.out.println("My rollNo is: " + rollNo);
		System.out.println("My name is: " + name);
	}
	
	public static void main(String[] args) {
		ConDemo cd = new ConDemo(); //constr call
		cd.showDetails();
	}
}
