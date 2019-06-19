/**********************************************************************************
 *  Problem: a002 "兩光占卜師" from Brian Kernighan                                      
 *  Language: JAVA                                                                                                    
 *  Author: Finley at 2017-12-18 05:55                                      
 **********************************************************************************/
import java.util.Scanner;

public class a003 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        // 掃描出入字串
        String s;
        // 把輸入字串放進S容器
        
        while (input.hasNext()) {
            s = input.nextLine();
            String [] str = s.split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = (a * 2 + b)%3;
            if(c == 0)
                System.out.println("普通");
            if(c == 1)
                System.out.println("吉");
            if(c == 2)
                System.out.println("大吉");
        }
        
    }
	
}
