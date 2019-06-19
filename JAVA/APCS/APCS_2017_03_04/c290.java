package APCS_2017_03_04;

import java.util.Scanner;

public class c290 {

	public static String checkCreditCard(String cardNo) {
		String result = "Wrong number!!";
		try {

			// separate the card number. 將數字放入字元陣列
			char[] sepCard = cardNo.toCharArray();
			// create a new array.
			int[] newA = new int[1000];
			int[] newB = new int[1000];

			for (int i = 0; i < sepCard.length; i++) {
				if ((i + 1) % 2 == 0) {
					newA[i] = Character.digit(sepCard[i], 10); // 偶數位轉為以10為基底整數
				} else {
					newB[i] = Character.digit(sepCard[i], 10); // 奇數位轉為以10為基底整數
				}
			}
			
			// 偶數位和
			int sumA = 0;
			for (int i = 0; i < newA.length; i++) {
				sumA += newA[i];
			}
			// 奇數位和
			int sumB = 0;
			for (int i = 0; i < newB.length; i++) {
				sumB += newB[i];
			}
			// 取絕對值
			int ans = Math.abs(sumA - sumB);
			
			result = Integer.toString(ans);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	public static void main(String argv[]) {

		Scanner input = new Scanner(System.in);
		// 掃描出入字串
		String strNum;
		// 把輸入字串放進S容器
		strNum = input.nextLine();

		System.out.print(checkCreditCard(strNum));

	}

}
