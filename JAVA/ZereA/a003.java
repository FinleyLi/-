/**********************************************************************************
 *  Problem: a002 "����e�R�v" from Brian Kernighan                                      
 *  Language: JAVA                                                                                                    
 *  Author: Finley at 2017-12-18 05:55                                      
 **********************************************************************************/
import java.util.Scanner;

public class a003 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        // ���y�X�J�r��
        String s;
        // ���J�r���iS�e��
        
        while (input.hasNext()) {
            s = input.nextLine();
            String [] str = s.split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = (a * 2 + b)%3;
            if(c == 0)
                System.out.println("���q");
            if(c == 1)
                System.out.println("�N");
            if(c == 2)
                System.out.println("�j�N");
        }
        
    }
	
}
