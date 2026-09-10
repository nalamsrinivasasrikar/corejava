package Assignment;
class Cls1{
	int  x=27;
	 void show() {
		 System.out.println("this is one");	
	 }
 }
 class Cls2 extends Cls1 {
	 int y= 34;
	 void see () {
		 System.out.println("see :"+super.x+ " "+this.y);
	 }
 }
//multilevel inheritance
class Cls3 extends Cls2{
	 int z=12;
	 void demo() {
		 System.out.println("see :"+super.x+ " "+super.y+ " "+this.z);
	 }
}
//hierarchical inheritance
 class Cls4 extends Cls1{
	 int z=12;
	 void demos() {
		 System.out.println("see :"+super.x+ " "+this.z);
	 }
 }
public class HybridInheritance {
public static void main(String[] args) {
	Cls3 c = new Cls3();
	c.demo();
	Cls4 s = new Cls4();
	s.demos();
}
}