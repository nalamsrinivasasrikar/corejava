package myprogs.basics;

public class Methods {

	
	void add() {
		int x=10, y=10;
		System.out.println("Add is : " + (x+y));
	}
	
	void addition(int c) {
		int a=38, b=6;
		System.out.println("Addition of 3 values is: " + (a+b+c));
	}
	
	//method with params and return type(int)
	int sum(int x, int y, int z) {
		return x+y+z+10;
	}
	
	public static void main(String[] args) {
		Methods m = new Methods();
		int res = m.sum(17, 34, 56);
		System.out.println("Result is: " + res);
	}	
}
