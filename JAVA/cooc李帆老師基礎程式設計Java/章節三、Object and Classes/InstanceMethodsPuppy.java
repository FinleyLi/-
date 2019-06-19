package coocJava;

/*
 * 章節三 Object and Class
 * Problem: Creating an Object Puppy
 * Input: Name; Age
 * Output: Name; Age; Variable Value
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

public class InstanceMethodsPuppy {
	int puppyAge;
	
	public InstanceMethodsPuppy(String name) {
	      // This constructor has one parameter, name.
	      System.out.println("Passed Name is :" + name );
	}
	
	public void setAge( int age ) {
	      puppyAge = age;
	}

	public int getAge( ) {
	      System.out.println("Puppy's age is :" + puppyAge );
	      return puppyAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Following statement would create an object myPuppy
		InstanceMethodsPuppy myPuppy = new InstanceMethodsPuppy( "tommy" );
		/* Object creation */
		// Puppy myPuppy = new Puppy( "tommy" );

	    /* Call class method to set puppy's age */
	    myPuppy.setAge( 2 );

	    /* Call another class method to get puppy's age */
	    myPuppy.getAge( );

	    /* You can access instance variable as follows as well */
	    System.out.println("Variable Value :" + myPuppy.puppyAge );

	}

}