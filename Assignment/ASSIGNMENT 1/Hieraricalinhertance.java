package Assignment;
class one{
	int  x=27;
	 void show() {
		 System.out.println("this is one");	
	 }
 }
 class two extends one {
	 int y= 34;
	 void see () {
		 System.out.println("see :"+super.x+ " "+this.y);
	 }
 }
class three extends one{
 int z=12;
 void demo(){
	 System.out.println("see :"+super.x+ " "+this.z);
 }
}

public class Hieraricalinhertance {
	public static void main(String[] args) {
		two w = new two();
		three r = new three();
		w.see();
		r.demo();
	}
}


