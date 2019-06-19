package coocJava;

/*
 * 章節二 經典名句
 * Problem: Triangle Area
 * Input: 底；高；單位
 * Output: 面積
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

import java.util.Scanner;
// import java.io.BufferedReader;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// 輸入 底
		System.out.println("請輸入三角形 底");
		int X = input.nextInt();
		/*
		 * next();string
		 * nextInt();
		 * nextFloat();
		 * nextBoolean();
		 * */
		
		// 輸入 高
		System.out.println("請輸入三角形 高");
		int Y = input.nextInt();		
		// 計算面積
		float Area = X*Y / 2;		
		// 輸出 面積
		
		System.out.println("請輸入單位");
		String Unit = input.next();
		
		System.out.println("\n" + "三角形面積: " + Area + Unit );

	}

}
