/*
 	1. Static Variables---------
 			a) Static variables are declares outside of all the methods but inside a class using static keyword.
 			b)Static variables can be used anywhere in the class.
 			c) It is not mandatory to initialize static variable.
 			d) It is not mandatory to use the class name while accessing the static variable, if we dont use the class name then compiler willl automaticaly append the class name.
 			e) When we access static variable with a reference we will get a warning message. Warning message cant hold the program ande hence we can still run the program, compiler will convert it to class name.
 			f) If we don't initialize it will automatically get some default values from the compiler(JVM).
 					Examples-------
 								i) For int----- 0
 								ii) For float -----0.0  etc.
 														
 			
 		
 */
package All_Concepts_of_Java;

public class G {
	
	static int i=10;
	static int j;
	static int k=9;
	
	public static void main(String[] args) {
		System.out.println(G.i);
		System.out.println(k);
		System.out.println(G.j);
		G g1 = new G();
		g1.test();
		System.out.println(g1.k);
	}
	
	public void test() {
		System.out.println(G.i);
		System.out.println(G.j);
	}

}
