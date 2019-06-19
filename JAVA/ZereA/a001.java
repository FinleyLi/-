/**********************************************************************************
 *  Problem: a001 "哈囉" from Brian Kernighan                                      
 *  Language: JAVA                                                                                                    
 *  Author: Finley at 2017-11-08 16:42                                      
 **********************************************************************************/
import java.util.Scanner;

public class a001 {
	
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        // 掃描出入字串
        String s;
        // 把輸入字串放進S容器
        
        while(input.hasNext()) {
            s = input.nextLine();
            System.out.println("hello, " + s);
        }
        
    }

}