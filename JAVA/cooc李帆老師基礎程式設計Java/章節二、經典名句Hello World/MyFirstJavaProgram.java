import java.util.Scanner;

public class MyFirstJavaProgram {

   /* This is my first java program.
    * This will print 'Hello World' as the output
    */

	// public宣告主函式為public就是告訴其他的類可以訪問這個函式。
	// static告知編譯器main函式是一個靜態函式，記憶體的儲存區不變。
	// void表明main()的返回值是無型別。
	// 引數String[] args為程式使用者在命令列狀態下與程式互動。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if (args.length == 0) {
		System.out.println("無引數..");
		}

		else {*/
		Scanner Input = new Scanner(System.in);
		int N = Input.nextInt();
		System.out.println("顯示命令列引數.."+N);
		/*for (String arg : args) {
		System.out.println(arg);
		}g

		System.out.println("args[0]" + args[0]);
		System.out.println("args[1]" + args[1]);
		}*/
	}
}
