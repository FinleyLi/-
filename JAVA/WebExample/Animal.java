// jerry的成神之路
// https://dotblogs.com.tw/jerryhuang0306/2016/01/26/194642

public class Animal {

	int age = 0;
	float weight = 0;

	public void speak() {
		System.out.println("age: " + age);
		System.out.println("weight:" + weight);
	}

	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}

}
