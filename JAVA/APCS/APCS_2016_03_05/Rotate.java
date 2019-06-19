package APCS_20160305;

/*
 * Problem: 第2題矩陣轉換
 * Input: R, C, M R行(line), 包含C個正整數, M個操作；矩陣內容
 * Output: 第k個操作，如果mk= 0 則代表旋轉，mk= 1 代表翻轉
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int r = input.nextInt(); // 有 R 行(line)
		int c = input.nextInt(); // 每一行(line)都包含 C 個正整數
		int op = input.nextInt(); //  M 個整數，表示對矩陣 A 進行的操作。
		
		// read in original data
		int[][] orig = new int[r][c];
		for (int i = 0; i < r; i++) // 每行共i列 (R)
			for (int j = 0; j < c; j++) // 每列共j行 (C)
				orig[i][j] = input.nextInt();
		
		// do operations
		int[][] result;
		for (int t = 0; t < op; t++) { // t: 進行M次操作
			if (input.nextInt() == 0) { // rotate: mk = 0 則代表旋轉
				result = new int[c][r];
				for (int i = 0; i < r; i++) {
					for (int j = 0; j < c; j++)
						result[j][r - i - 1] = orig[i][j];
				}
				orig = result;
				int tmp = c;
				c = r;
				r = tmp;
			} else { // flip, exchange rows: mk = 1 代表翻轉
				result = new int[r][c];
				for (int i = 0; i < r; i++) {
					for (int j = 0; j < c; j++)
						result[r - i - 1][j] = orig[i][j];
				}
				orig = result;
			}
		}
		
		// print R' C': 矩陣 A 的列數和行數
		System.out.print(r + " " + c);
		System.out.println();
		
		// print out result
		for (int i = 0; i < r; i++) {
			System.out.print(orig[i][0]);
			for (int j = 1; j < c; j++)
				System.out.print(" " + orig[i][j]);
			System.out.println();
		}

	}

}

/*
3 2 3
1 1
3 1
1 2
1 0 0

3 2 2
3 3
2 1
1 2
0 1
*/
