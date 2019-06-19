package coocJava;

/*
 * 章節六 解題工具
 * Problem: 排序
 * Input: Null
 * Output: sort由小至大排序; collections由大至小排序
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberArray = { 70, 80, 31, 37, 10, 1, 48, 60, 33, 80 };
		int i;

		Arrays.sort(numberArray);// 排序陣列
		System.out.print("陣列元素由小排到大  ");

		for (i = 0; i < numberArray.length; i++) // 印出陣列
			System.out.print(numberArray[i] + " ");

		System.out.println(" ");

		// Note that we have Integer here instead of
		// int[] as Collections.reverseOrder doesn't
		// work for primitive types.
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

		// Sorts arr[] in descending order
		Arrays.sort(arr, Collections.reverseOrder());

		System.out.printf("Modified arr[] : %s", Arrays.toString(arr));

	}
}
