package myprogs.basics;

class Example{
	int x = 5, y = 6;
	
	void addition() {
		System.out.println("Addition is: " + (x+y));
	}
	
	void subtraction() {
		System.out.println("Subtraction is: " + (x-y));
	}
}

class Demo{
	void showData() {
		System.out.println("This is show data from class Demo");
	}
}

public class SampleProg {
	public static void main(String[] args) {
		int x = 10, y = 20;
		int z = x+y;
		System.out.println("Result is: " + z);
		
		Demo d = new Demo();
		d.showData();
		
		Example e = new Example();
		e.addition();
		e.subtraction();
	}
}
