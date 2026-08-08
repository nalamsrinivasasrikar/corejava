package myprogs.basics;
class A{
	int x=5;
	float si(float p, int t,float roi) {
		float si=(p*t*roi)/100;
		return si;
	}
}
class B extends A{
	@Override
	float si(float p,int t, float r) {
		float si=(p*t*r)/10;
		return si;
		
	}
	void access() {
		float result = si(100,3,4.35f);
		System.out.println("si value is :" + result);
	}
	
}
public class Inheritence {
	public static void main(String[] args) {
	 B b2=new B();
	 b2.access();
	 
	}
}