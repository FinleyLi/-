package coocJava;
import java.util.*;

//Compiler version JDK 11.0.2
/*
 * 章節三 Object and Class
 * Problem: Creating an Object Puppy
 * Input: Null
 * Output: Passed Name is tommy
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

class sayHello{ //駱駝式命名法
     public sayHello(){
        System.out.print("hello World");
    }
}

public class CreatingAnObject { //public 修飾符
	
	public  CreatingAnObject(String name) {
        	// This constructor has one parameter, name.
        	// 在定義類別時，可以使用建構式定義物件建立的初始流程。建構式是與類別名稱同名，無需宣告傳回型態的方法。
		System.out.println("Passed Name is: " + name );
	}
  
        public static void sayA(String word) {
		System.out.println("Hello, "+ word);
	}
	
	public static void main(String[] args) { //void 返回類型保留字
		// TODO Auto-generated method stub
		System.out.print("hello World");
		
		/* Following statement would create an object myPuppy */
		//CreatingAnObject myPuppy = new CreatingAnObject( "Tommy" );
		
		/* Call Method CreatingAnObject */
		//sayA( "Tommy" );
		
		/* Object creation */
		//指定引數建立(實體化) hello C實例
		//sayHello World = new sayHello();

	}

}
