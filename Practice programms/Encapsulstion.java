package Arrays;
class A{
	private int items;
	 private int count;
	 void set(){
		 items=2;
		 count=2;
	 }
		 int get() {
		 return items+count;
	 }
	 class B extends A {
		 String name ="srikar";
		 void sets() {
			 name="srikar";
		 }
		 String gets(){
			 return name;
		 }
	 }
}
public class Encapsulstion {
	public static void main(String[] args) {
		A a= new A();
		a.set();
		System.out.println(a.get());
		A.B b= a.new B();// we write A.B beacuse b is declared as an inner class of A
		b.sets();
		System.out.println(b.gets());
	}

}
