/*
 	Reference Variable---------
 		1) Reference variables are used to store memory addresses, it can never store ordinary values.
 		2) There are two types of reference variables---
 				i) Local reference variable
 				ii) Static reference variable
 				
 			Local reference variable-----
 					a) They are created within a method and should be used only within the created method.
 			
 			Static reference variable------
 				a) This variables are created outside all the methods but then inside the class using static keyword.
 				b) These variables can be used anywhere in the class because these are like global variables. 
 					
 */
package All_Concepts_of_Java;

		//STATIC REFERENCE VARIABLE

/*
public class I {
	
	int i=10;
	
	public static void main(String[] args) {
		 I i1=new I();
		 System.out.println(i1.i);
		 i1.test();
	}
	public void test() {
		System.out.println(i1.i); // this will give an error because i1 is the local object created at main method we cant access in any other method.
		
	}
}
	
*/
	
	
	// STATIC REFERENCE VARIABLE

public class I {
	
	int j=10;
	static I i1;
	
	public static void main(String[] args) {
		i1=new I();
		System.out.println(i1.j);
		i1.test();
	}
	public void test() {
		System.out.println(i1.j);
	}
}
	
	


