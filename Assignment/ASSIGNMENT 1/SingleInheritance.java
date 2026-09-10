package Assignment;
class Ones{
	int  x=27;
	 void show() {
		 System.out.println("this is one");	
	 }
}
//single inheritance
class Twos extends Ones {
	 int y= 34;
	 void see () {
		 System.out.println("see :"+super.x+ " "+this.y);
	 }
}
public class SingleInheritance {
public static void main(String[] args) {
	Twos t = new Twos();
	t.see();
	t.show();
}
}
