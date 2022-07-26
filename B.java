/*
 	1. Object creation is mandatory to access the non-static members.
 	2. Static members belongs to the class 
 	3. Static member they get loaded in to the common memory of the class
 	4. Always there will be one copy of static members where as no. of non-static members will be equal to no. of object created.
 	5. To access static member we use---- 
 			class_name.member_name
*/

package All_Concepts_of_Java;

public class B {
	
	int i=10;
	static int j=20;
	int k=40;
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.k);
		System.out.println(B.j);
	}
}
