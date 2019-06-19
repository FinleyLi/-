import java.util.Arrays;

public class SortArray {
	public static void main(String args[]) {
		int[] numberArray = { 70, 80, 31, 37, 10, 1, 48, 60, 33, 80 };
		int i;

		Arrays.sort(numberArray);// 排序陣列
		System.out.print("陣列元素由小排到大  ");

		for (i = 0; i < numberArray.length; i++) // 印出陣列
			System.out.print(numberArray[i] + " ");

	}
}