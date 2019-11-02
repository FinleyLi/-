package coocJava;

/*
 * 章節二 經典名句
 * Problem: First Java Program
 * Input: 
 * Output: hello, world
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

class sayB{
	String BB;
	String get(){
	    System.out.println("Hello, "+BB);
		return BB;
	}
	void put(String w){   //put 函數，用來設定
        BB = w;
	}
}

class sayC{
     public sayC(){
        System.out.print("Hello, ");
    }
    public sayC(String CC){
        this(); // 呼叫同一類別內class sayC的其他建構式Constructor。
        System.out.println(CC);
    }
}

class sayD{
    public sayD(){
        System.out.println("Hello, D");
    }
    public sayD(int n,double gas){
        this(); // 呼叫同一類別內的其他建構式。
        System.out.println("Hi, Siri");
    }
}
class ShowMe extends sayD{ //繼承sayD
    public ShowMe(){
        super(); // 從子類別class ShowMe呼叫其父類別class sayD的建構式。
    }
}

public class helloWorld
{
    
    public static void sayA(String word) {
        System.out.println("Hello, "+ word);
    }
    
	public static void main(String[] args) {
		System.out.println("Hello original World");
		
		// 指定引數呼叫sayA方法Method
		sayA("A");
		
		// 無引數建立(實體化) hello A實例
		sayB helloB = new sayB();
		// 呼叫 put()方法並改變BB字串內容
		helloB.put("B");
		// 呼叫 get()方法列印結果
		helloB.get();
		
		// 指定引數建立(實體化) hello C實例
		sayC helloC = new sayC("C");
		
		ShowMe helloD = new ShowMe();
	}
}
