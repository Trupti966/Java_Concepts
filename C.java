/*
    using all type of concept together.
 */
package All_Concepts_of_Java;

public class C {
	static int i;
	int j;
	static C c1;
	public static void main(String[] args) {
		int k;
		System.out.println(k); // This will give an error because local variable must be initialize before accessing it.
		 c1 = new C();
		 System.out.println(c1.j);
		 System.out.println(i);
	}
}
