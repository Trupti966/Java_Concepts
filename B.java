/*
    using all type of concept together.
 */
package All_Concepts_of_Java;

public class B {
	static int i;
	int j=10;
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.j);
		b1.test();
	}
	public void test() {
		B b2 = new B();
		System.out.println(b2.i);
	}
}
