/*
 * 章節五 Loop循環
 * Problem: 宣告陣列
 * Input: 
 * Output: 依不同位置輸入 vs 整批輸入; 範圍表示 size, .length
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

package coocJava;

import java.util.Arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 數組大小
		int size = 10;
		// 定義數組
		double[] myList = new double[size];
		myList[0] = 5.6;
		myList[1] = 4.5;
		myList[2] = 3.3;
		myList[3] = 13.2;
		myList[4] = 4.0;
		myList[5] = 34.33;
		myList[6] = 34.0;
		myList[7] = 45.45;
		myList[8] = 99.993;
		myList[9] = 11123;
		// 計算所有元素的總和
		double total = 0;
		for (int i = 0; i < size; i++) {
			total += myList[i];
		}
		System.out.println("總合為： " + total);

		// 宣告陣列
		int[] numberArray = { 70, 80, 31, 37, 10, 1, 48, 60, 33, 80 };
		// 印出陣列
		for (int i = 0; i < numberArray.length; i++)
			System.out.print(numberArray[i] + " ");

		System.out.println(" ");

		// 宣告陣列
		String[] names = { "James", "Larry", "Tom", "Lacy" };
		// 印出陣列
		for (String name : names) {
			System.out.print(name);
			System.out.print(",");
		}
		System.out.print("\n");

		// 宣告陣列
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
		// 印出陣列printf列印格式化字串
		System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
	}
}
