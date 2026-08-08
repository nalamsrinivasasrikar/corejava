package myprogs.basics;
abstract class Q{
	int y=15;
	void first() {
		System.out.println("This is th first method");
	}
	abstract void second();
}
public class Abstract extends Q{
	void second() {
		System.out.println("This is second method");
	}
public static void main (String[] args) {
 Abstract ab= new Abstract();
 System.out.println(ab.y);
 ab.first();
 ab.second();
}
}
