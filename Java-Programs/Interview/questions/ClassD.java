package questions;

public class ClassD {

	public static void m1() {
		System.out.println("Allabakshu");
		//m2();
	}

	public void m2() {
		System.out.println("Johnny");
		m1();
	}
	
	
	public ClassD() {
		// TODO Auto-generated constructor stub
		
	}
	
	// Cannot call non static in static
	// Can call static in non static

}
