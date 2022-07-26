/*
 	Non-Static Variable--------
 		1) Non-static variables are declared outside all the method but then inside the class without static keyword.
 		2) Non-static variables can be access only after object creation.
 		3)It is not mandatory to initialize non-static variable, if we dont initialize it automatically get the default value by the compiler.
 		
 */
package All_Concepts_of_Java;

public class H {
	
	int i=10;
	int k=20;
	int l;
	
	public static void main(String[] args) {
		H h1 = new H();
		System.out.println(h1.i);
		System.out.println(B.k); // This will give an error because we are trying to use it by using class name. here object creation is mandatory.
		System.out.println(h1.l);
		
	}
}
