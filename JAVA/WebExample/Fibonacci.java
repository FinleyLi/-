import java.util.Scanner;

public class Fibonacci {

	public static void main(String args[]) {

		System.out.printf("輸入你想要的個數");
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		System.out.println(input);
		if (input == 0) {
			System.out.println("0");
		} else if (input == 1) {
			System.out.println("0,1");
		} else {

			int formerItem1 = 1;
			int formerItem2 = 0;
			int item = 0;

			System.out.print("0,1,");

			for (int i = 2; i < input; i++) {
				item = formerItem1 + formerItem2;
				formerItem2 = formerItem1;
				formerItem1 = item;

				if (i != input - 1) {
					System.out.print(item + ",");
				}
				if (i == input - 1) {
					System.out.print(item);
				}
			}
		}
	}
}