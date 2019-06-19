
import java.math.*;
import java.util.*;

public class IDidentify {

	static char[] characterArray = new char[26];// A-Z
	static int[] numberArray = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29,
			32, 30, 31, 32 };// A-Z�������Ʀr
	static int[] stringToIntArray = new int[26];// ���J���r��

	public static void main(String[] args) {
		insertCharacter();// ���J�^��r��

		String inputString = getInput();// ��J�����Ҧr��

		check(inputString);// �}�l�ˬd
		System.out.println(inputString);

	}

	static String getInput() {
		System.out.println("�п�J�����Ҧr��");
		Scanner sc = new Scanner(System.in);
		String idArray = sc.nextLine().toUpperCase();// �L�צp����j�g

		return idArray;// �^�Ǧr��
	}

	static void check(String a) {

		int index = 0;
		String inputString = a;// ��i�Ӫ������Ҧr��
		Character firstLetter = inputString.charAt(0);// ��X�r��Ĥ@�ӭ^��
		for (int i = 1; i <= inputString.length() - 1; i++) {
			stringToIntArray[i] = (int) (inputString.charAt(i)) - 48;// �⨭���Ҧr����JstringToIntArray[]�AinputString.charAt(i)�̭����O�r��1->49�ҥH��48int
																		// 1

			System.out.println(stringToIntArray[i]);// �����ˬd�ۤv���S�����
		}
		index = Arrays.binarySearch(characterArray, firstLetter);// ��J���Ĥ@�ӭ^��r���P�_�o�O�bcharacterArray�����ĴX��index
		int d0 = numberArray[index];// �����쪺�Ʀr��X�ө�Jd0
		int x2 = (d0) % 10;// d0���Ӧ��
		int x1 = (int) Math.floor((d0) / 10);// d0���Q���

		int result = x1 + (9 * x2) + (8 * stringToIntArray[1]) + (7 * stringToIntArray[2]) + (6 * stringToIntArray[3])
				+ (5 * stringToIntArray[4]) + (4 * stringToIntArray[5]) + (3 * stringToIntArray[6])
				+ (2 * stringToIntArray[7]) + (stringToIntArray[8]);
		int checkCode = 10 - (result % 10);

		if (stringToIntArray[9] == checkCode) {
			System.out.println("�����ҥ��T");
		} else {
			System.out.println("�����ҿ��~");
		}

	}

	static void insertCharacter() {

		for (int i = 0; i <= 25; i++) {
			characterArray[i] = (char) (65 + i);// ��^��r����J�r���}�C�A�j���૬A->65
		}

	}
}