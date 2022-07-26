/*
    using all type of concept together.
 */
package All_Concepts_of_Java;

public class E {
	static E e1;
	int i;
	public static void main(String[] args) {
		int k=10;
		e1=new E();
		System.out.println(e1.i);
		e1.test();
	}
	public void test() {
		System.out.println(k); // This will give an error because we cant access the local variable of k from main method.
	}
}
