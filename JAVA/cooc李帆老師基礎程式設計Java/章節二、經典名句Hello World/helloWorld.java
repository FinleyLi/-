package coocJava;

/*
 * 章節二 經典名句
 * Problem: First Java Program
 * Input: 
 * Output: hello, world
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

public class helloWorld {
	// 建構式 Constructor
	/*public helloWorld(){
		System.out.print("hello, world");
	}*/
	// static變數就是在載入程式後會主動配給記憶體給程式(僅一次)，後續無論實例化多少次，記憶體位置都一樣。
	private static void say(String s) {
		System.out.print("hello, world");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		say("hello, world");

	}

}
