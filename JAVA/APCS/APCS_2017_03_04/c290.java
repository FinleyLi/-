package APCS_2017_03_04;

import java.util.Scanner;

public class c290 {

	public static String checkCreditCard(String cardNo) {
		String result = "Wrong number!!";
		try {

			// separate the card number. �N�Ʀr��J�r���}�C
			char[] sepCard = cardNo.toCharArray();
			// create a new array.
			int[] newA = new int[1000];
			int[] newB = new int[1000];

			for (int i = 0; i < sepCard.length; i++) {
				if ((i + 1) % 2 == 0) {
					newA[i] = Character.digit(sepCard[i], 10); // ���Ʀ��ର�H10���򩳾��
				} else {
					newB[i] = Character.digit(sepCard[i], 10); // �_�Ʀ��ର�H10���򩳾��
				}
			}
			
			// ���Ʀ�M
			int sumA = 0;
			for (int i = 0; i < newA.length; i++) {
				sumA += newA[i];
			}
			// �_�Ʀ�M
			int sumB = 0;
			for (int i = 0; i < newB.length; i++) {
				sumB += newB[i];
			}
			// �������
			int ans = Math.abs(sumA - sumB);
			
			result = Integer.toString(ans);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	public static void main(String argv[]) {

		Scanner input = new Scanner(System.in);
		// ���y�X�J�r��
		String strNum;
		// ���J�r���iS�e��
		strNum = input.nextLine();

		System.out.print(checkCreditCard(strNum));

	}

}
