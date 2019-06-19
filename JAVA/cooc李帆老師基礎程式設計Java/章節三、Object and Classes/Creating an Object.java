package coocJava;

/*
 * 章節三 Object and Class
 * Problem: Creating an Object Puppy
 * Input: Null
 * Output: Passed Name is tommy
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

public class CreatingAnObject {
	
	public CreatingAnObject(String name) {
	      // This constructor has one parameter, name.
	      System.out.println("Passed Name is :" + name );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Following statement would create an object myPuppy
		CreatingAnObject myPuppy = new CreatingAnObject( "tommy" );
		/* Object creation */
		// Puppy myPuppy = new Puppy( "tommy" );

	}

}
