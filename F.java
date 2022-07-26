/*
 	1. Local Variable-------
 			a) They are created within a method and should be used within the created method.
 			b) We dont required reference to access the local variables.
 			c) Local variables can be access directly.
 			d) If you are using local variable without initialize it you will get an error.
 			
 */
package All_Concepts_of_Java;

public class F {
	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		F f1 = new F();
		f1.test();
		F.test1();
		System.out.println(j); // This will give an error because j is the local variable of test1 method.
	}
	public void test() {
		System.out.println(i); // This will throw an error because i is the local variable of main method we cant use it in test method.
		
	}
	public static void test1() {
		int j=10;
		System.out.println(j);
	}

}
