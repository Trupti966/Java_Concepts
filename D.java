/*
    using all type of concept together.
 */
package All_Concepts_of_Java;

public class D {
	 int i;
	 static int j;
	 public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.j);
		D.test();
	}
	 public static void test() {
		 D d2 = new D();
		 int k=0;
		 System.out.println(k);
		 System.out.println(d2.i);
	 }
}
