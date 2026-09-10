package Assignment;
class C1{
	int  x=27;
	 void show() {
		 System.out.println("this is one");	
	 }
 }
 class C2 extends C1 {
	 int y= 34;
	 void see () {
		 System.out.println("see :"+super.x+ " "+this.y);
	 }
 }
 class C3 extends C2{
	 int z=12;
	 void demo() {
		 System.out.println("see :"+super.x+ " "+super.y+ " "+this.z);
	 }
	  void addition (){
		 System.out.println("addition :" +(x+y+z));
     }
 }
public class Multiple {
public static void main(String[] args) {
	C3 T=new C3();
	T.demo();
	T.addition();
}
}

