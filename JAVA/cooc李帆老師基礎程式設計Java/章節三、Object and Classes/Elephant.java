// package coocJava;
// default package
// 如果你在宣告類別時沒有加上任何存取修飾， 則預設為package存取範圍，該類別僅限於同一個package下的成員所使用。

public class Elephant extends Animal{
	
	
	String name = "";
	
	void speak() {
    	System.out.println("age: " + age);
    	System.out.println("weight:" + weight);
    	System.out.println("name:" + name);    	
	} 
	
	Elephant( int age, float weight, String name){
		super(age, weight);
		this.name = name;
	}

}
