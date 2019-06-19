// Life and Work about T.W.
// https://cookieandcoketw.blogspot.tw/2012/02/java-a005-eva_7290.html

import java.util.Scanner;
public class A_Series {

	static String strA; // 宣告全域變數strA容器為字串
	static int intA; // 宣告全域變數intA容器為數字

	/**********************************************************************************
	 *  Problem: a001 "哈囉"                                     
	 *  cin: World
	 *  cout: Hello, World                                                                                                    
	 *  Author: Finley at 2017-11-08 16:42                                      
	 **********************************************************************************/
    public static void a001() {
        Scanner input = new Scanner(System.in);
        // 將class類別Scanner實體化為object物件input
        
        while(input.hasNext()) {
        	strA = input.nextLine();
            // 把每一行的輸入input放進S字串容器
            System.out.println("hello, " + strA);
            // 列印hello, s
        }
    }
    
    /**********************************************************************************
     *  Problem: a002 "簡易加法"                                    
     *  cin: 5 + 10
	 *  cout: 15                                                                                                  
     *  Author: Finley at 2017-12-18 15:35                                      
     **********************************************************************************/
    public static void a002() {
    	Scanner input = new Scanner(System.in);
    	// 將class類別Scanner實體化為object物件input
        int b; //區域變數，範圍在a002()有效
        // 宣告b容器為整數
        
        while(input.hasNextInt()) {
        	intA = input.nextInt();
        	b = input.nextInt();
            // 把下一個整數的輸入input放進a數字容器, 下一個整數的輸入input b數字容器
            
            System.out.println(intA + b);
            // 列印a + b的結果
        }
    }
    
    /**********************************************************************************
     *  Problem: a003 "兩光法師占卜術"                                    
     *  cin: 9 24
	 *  cout: (9 * 2 + 24)%3 select 普通、吉、大吉                                                                                                      
     *  Author: Finley at 2017-12-18 15:55                                      
     **********************************************************************************/

    public static void a003() {
    	Scanner input = new Scanner(System.in);
    	// 將class類別Scanner實體化為object物件input
        
        while (input.hasNext()) {
        	strA = input.nextLine();
            // 把每一行的輸入input放進strA字串容器
            String [] strArray = strA.split(" "); //區域變數，範圍在while()有效
            // 宣告str容器為陣列，內容為strA以" "分離
            
            int a = Integer.parseInt(strArray[0]); //區域變數，範圍在while()有效
            // 將字串解析為十進位整數，從str[0]取出字串轉為整數
            int b = Integer.parseInt(strArray[1]); //區域變數，範圍在while()有效
            // 將字串解析為十進位整數，從strArray[1]取出字串轉為整數
            int c = (a * 2 + b)%3; //區域變數，範圍在while()有效
            // 宣告c容器為數字 ， (a * 2 + b)/3取餘數
            
            if(c == 0)
                System.out.println("普通");
            	// 餘數c為0，輸出"普通"
            if(c == 1)
                System.out.println("吉");
            	// 餘數c為1，輸出"吉"
            if(c == 2)
                System.out.println("大吉");
            	// 餘數c為2，輸出"大吉"
        }
    }
    
    /**********************************************************************************
     *  Problem: a004 "文文的求婚"                                    
     *  cin: 1977
	 *  cout: 平年
	 *  PS: 西元年被4整除且不被100整除，或被400整除者即為閏年                                                                                                      
     *  Author: Finley at 2017-12-26 15:19                                      
     **********************************************************************************/
    public static void a004() {
        
    	Scanner input = new Scanner(System.in);
    	// 將class類別Scanner實體化為object物件input
        
        while (input.hasNext()) {
        	intA = input.nextInt();
			// 把下一個整數的輸入input放進a數字容器
			
			//西元年被4整除且不被100整除，或被400整除者即為閏年
			if (((intA % 4) == 0 && (intA % 100) != 0) || (intA % 400) == 0)
				System.out.println("閏年");
			else
				System.out.println("平年");
		}
    }

    public static void main(String[] argv) {

        a002();
        // 選擇執行的題目

    }
	
}
