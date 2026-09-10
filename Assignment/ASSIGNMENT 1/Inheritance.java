package Assignment;
interface riya{
	 int x=10;
	void siva();
}
//interface extends interface
interface raji extends riya {
	int z=15;
	void lucky();
}
//class extends interfaces
class Raghu implements riya, raji{
	@Override
	 public void siva() {
		System.out.print("Iam srikar");
	}
	@Override
	public void lucky() {
		System.out.print("nalam");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Raghu r=new Raghu();
		r.siva();
		r.lucky();
	}
}

