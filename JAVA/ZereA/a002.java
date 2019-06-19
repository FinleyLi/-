/**********************************************************************************
 *  Problem: a002 "簡易加法" from Brian Kernighan                                      
 *  Language: JAVA                                                                                                    
 *  Author: Finley at 2017-12-18 05:55                                      
 **********************************************************************************/
import java.util.Scanner;

public class a002 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		// 掃描出入數字
        int a, b;
        // 把輸入數字放進a, b容器
        
        while(input.hasNextInt()) {
            a = input.nextInt();
            b = input.nextInt();
            
            System.out.println(a + b);
        }

	}
	
}
