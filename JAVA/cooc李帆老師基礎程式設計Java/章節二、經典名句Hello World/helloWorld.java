package coocJava;

/*
 * 章節二 經典名句
 * Problem: First Java Program
 * Input: 
 * Output: hello, world
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

class Hello{
    private String name;

    public Hello(){
        name = "nobody";
    }

    public Hello(String one){
        name = one;
    }

    public void hello(){
        System.out.print("Hello ");
        System.out.println(name);
    }

    public void setName(String one){
        name = one;
    }
}

public class Main
{

	// static變數就是在載入程式後會主動配給記憶體給程式(僅一次)，後續無論實例化多少次，記憶體位置都一樣。
	private static void say(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		say("hello, world");
        
        // 指定引數建立 hello 實例
        Hello hello = new Hello("Java");
        // 呼叫 hello()方法
        hello.hello();
 
        // 呼叫 setName()改變 name 的參考對象
        hello.setName("caterpillar");
        hello.hello();
	}

}
