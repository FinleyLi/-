import java.util.Arrays;
import java.util.Scanner;

public class SearchArrayElement {
	public static void main(String args[]) {

		System.out.println("請輸入想查詢的值");
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		int printOut = 0;

		int[] numberArray = { 1, 10, 31, 33, 37, 48, 60, 70, 80 };
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] == input) {
				printOut = 1;
				System.out.print("numberArray[" + i + "]");
			}
		}
		if (printOut == 0)
			System.out.print("-1");
	}
}
