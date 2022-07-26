/*
    using all type of concept together.
 */
package All_Concepts_of_Java;

public class A {
	static int j;
	static int i;
	
	public static void main(String[] args) {
		int k=10;
		System.out.println(k);
		A a1 = new A();
		a1.test();
	}
	public void test() {
		System.out.println(i);
		System.out.println(a1.j); // This one give an error because we are trying to use the local reference object in test method.
	}
}
