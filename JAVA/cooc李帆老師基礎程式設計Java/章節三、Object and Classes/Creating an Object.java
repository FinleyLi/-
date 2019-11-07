class sayHello{
     public sayHello(){
        System.out.print("hello World");
    }
}

public class CreatingAnObject {
	
	public  CreatingAnObject(String name) {
	//public static void CreatingAnObject(String name) {
	      // This constructor has one parameter, name.
	      System.out.println("Passed Name is: " + name );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Following statement would create an object myPuppy */
		CreatingAnObject myPuppy = new CreatingAnObject( "Tommy" );
		
		/* Call Method CreatingAnObject */
		//CreatingAnObject( "Tommy" );
		
		/* Object creation */
		// Puppy myPuppy = new Puppy( "Tommy" );
		
		// 指定引數建立(實體化) hello C實例
		//Hello World = new sayHello();

	}

}
