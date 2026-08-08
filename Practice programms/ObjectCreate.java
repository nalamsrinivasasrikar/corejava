package Arrays;

class Base{
	int x=9;
void add() {
	System.out.println("add is:"+ (x+5)); 
	} 
}
class bottom extends Base{
	int y=55;
	void sub() { 
		System.out.println("sub is :"+ (y-40)); 
		} 
	} 

public class ObjectCreate { 
	public static void main(String[] args) {
		bottom obj =new bottom(); 
		System.out.println("variable is:"+ obj.x); 
		obj.add();
		obj.sub();
	}
}