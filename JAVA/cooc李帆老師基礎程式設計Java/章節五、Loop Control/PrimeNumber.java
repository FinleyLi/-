package coocJava;

/*
 * 章節五 Loop Control
 * Problem:  尋找質數
 * Input: Integer
 * Output: 是否為質數
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

import java.util.Scanner;
import java.lang.Math.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 外部輸入設定為變數sc
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num = sc.nextInt();
			int sq = (int) Math.sqrt(num);
			boolean prime = true;

			for (int i = 2; i <= sq; ++i) {
				if (num % i == 0) {
					prime = false;
					break;
				}
			}

			System.out.println(prime ? "質數" : "非質數");

		}
	}
}
