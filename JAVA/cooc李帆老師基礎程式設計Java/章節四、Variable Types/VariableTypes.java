package coocJava;

/*
 * 章節四 Variables
 * Problem:  Local Variable
 * Input: Null
 * Output: 不同類型變數可表示範圍
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

public class VariableTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte
		System.out.println("基本類型：byte 二進制位數：" + Byte.SIZE);
		System.out.println("包裝類：java.lang.Byte");
		System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
		System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
		System.out.println();

		// short
		System.out.println("基本類型：short 二進制位數：" + Short.SIZE);
		System.out.println("包裝類：java.lang.Short");
		System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
		System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
		System.out.println();

		// int
		System.out.println("基本類型：int 二進制位數：" + Integer.SIZE);
		System.out.println("包裝類：java.lang.Integer");
		System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
		System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
		System.out.println();

		// long
		System.out.println("基本類型：long 二進制位數：" + Long.SIZE);
		System.out.println("包裝類：java.lang.Long");
		System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
		System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
		System.out.println();

		// float
		System.out.println("基本類型：float 二進制位數：" + Float.SIZE);
		System.out.println("包裝類：java.lang.Float");
		System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
		System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
		System.out.println();

		// double
		System.out.println("基本類型：double 二進制位數：" + Double.SIZE);
		System.out.println("包裝類：java.lang.Double");
		System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
		System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
		System.out.println();

		// char
		System.out.println("基本類型：char 二進制位數：" + Character.SIZE);
		System.out.println("包裝類：java.lang.Character");
		// 以數值形式而不是以字符形式將Character.MIN_VALUE輸出到控制台
		System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
		// 以數值形式而不是以字符形式將Character.MAX_VALUE輸出到控制台
		System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);

	}

}
