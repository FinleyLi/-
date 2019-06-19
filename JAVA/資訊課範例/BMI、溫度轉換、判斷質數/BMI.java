/*
* 試撰寫一程式，直接設定整數值height 與weight，分別代表某個人的身高（公尺）與
體重（公斤），接著完成下列問題：
(a) 利用BMI = weight / height2計算此人的身體質量指數BMI值。
(b) 根據BMI 值判斷他的體重是不是過重。理想體重範圍為18.5≦BMI＜24，當BMI
值為理想體重範圍時，印出"體重標準"。BMI 值若是小於18.5，印出"體重過輕"，
BMI 值若是大於等於24，印出"體重過重"。
*/
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		System.out.println("請輸入身高與體重");
		Scanner input = new Scanner(System.in);
		double height = input.nextDouble();
		double weight = input.nextDouble();

		double Bmi=weight/((height/100)*(height/100));
		System.out.println(Bmi);

		if(Bmi<=18.5){
			System.out.println("體重過輕bmi=="+Bmi);
		}else if(Bmi>=24){
			System.out.println("體重過重bmi=="+Bmi);
		}else{
			System.out.println("體重標準bmi=="+Bmi);
		}
	}

}

/*

請輸入1身高與2體重
178
58
18.30576947355132
體重過輕bmi==18.30576947355132

*/
