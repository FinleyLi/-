package APCS_20160305;

/*
 * Problem: 第3題線段覆蓋長度
 * Input: 有N個線段；開始端點座標和結束端點座標整數值
 * Output: 輸出其總覆蓋的長度
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

import java.util.Scanner;

public class Segment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] begin = new int[n];
		int[] end = new int[n];
		int segs = 0;
		for (int i = 0; i < n; i++) {
			int start = input.nextInt();
			int stop = input.nextInt();
			// check previos data to find longest segment
			int j = 0; // checking element
			while (j < segs) { // while has more segment to check
				// check overlap for segment j and current input
				if (start >= begin[j] && start <= end[j] || stop >= begin[j] && stop <= end[j]
						|| begin[j] >= start && begin[j] <= stop || end[j] >= start && end[j] <= stop) {
					// expand segment range
					// Summary of Operators
					// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
					start = start <= begin[j] ? start : begin[j];
					stop = stop >= end[j] ? stop : end[j];
					// delete j segment
					for (int k = j + 1; k < segs; k++) {
						begin[k - 1] = begin[k];
						end[k - 1] = end[k];
					}
					segs--;
				} else { // check next segment
					j++;
				}
			}
			// reinsert the expanded segment
			begin[segs] = start;
			end[segs++] = stop;
		}
		int totalLen = 0;

		// 顯示結合後的最終覆蓋區域
		for (int i = 0; i < segs; i++) {
			System.out.print(begin[i] + " ");
			System.out.println(end[i]);
			totalLen = totalLen + (end[i] - begin[i]);
		}

		System.out.println(totalLen);
	}

}

/*
5
160 180
150 200
280 300
300 330
190 210

1
120 120
*/
