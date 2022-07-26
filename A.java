/* 	1. Class is the factory which generates objects.
			2. To request a class to generate object we use new keywords followed by paranthesis with class name.
			3. Object is an type/instance of class.
			4. Every time an object is created only non-static members gets loaded into the object.
			5. To access the object we store its memory address in the reference variable,
				Syntanx---
						class_name reference_variable_name = new class_name();
*/
package All_Concepts_of_Java;

public class A {
	int i=10;
	public static void main(String[] args) {
		// This will create one object in the RAM.
		A a1 = new A();
		
		// This will print the address of the object in the RAM.
		System.out.println(a1);
		
		// This will print the value of i inside the ram.
		System.out.println(a1.i);
	}

}
