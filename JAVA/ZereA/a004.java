import java.util.Scanner;

public class a004 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input;
		while (in.hasNext()) {
			input = in.nextLine();
			int a = Integer.parseInt(input);
			if (((a % 4) == 0 && (a % 100) != 0) || (a % 400) == 0)
				System.out.println("¶|¦~");
			else
				System.out.println("¥­¦~");
		}
	}
}
