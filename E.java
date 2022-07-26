/*
 	1. Object creation is not mandatory for static methods.
 		it can be directly access at main by using the class name.
 */
package All_Concepts_of_Java;

public class E {
	public static void main(String[] args) {
		E.test();
	}
	public static void test() {
		System.out.println("From Test");
	}

}
