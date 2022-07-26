/*
 	1. After object creation non-static members are get in to the object and the methods are
 		also non-static members so we need to call the methods by using the reference variables.
 	
*/

package All_Concepts_of_Java;

public class C {
	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();	
	}
	public void test1() {
		System.out.println("From Test1");
	}
}
