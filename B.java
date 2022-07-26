/*
 	1. Object creation is mandatory to access the non-static members.
 	
*/

package All_Concepts_of_Java;

public class B {
	
	int i=10;
	static int j=20;
	int k=40;
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.k);
	}
}
