package questions;

public class ClassB extends ClassA{

	
	public void m1() {
		// TODO Auto-generated method stub
	
		System.out.println("Johnny");
	}
	public void m2() {
		// TODO Auto-generated method stub
	    super.m1();
		System.out.println("salman");
	}
	

	
	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.m1();
		b.m2();
	}
	
}
