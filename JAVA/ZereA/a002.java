/**********************************************************************************
 *  Problem: a002 "²���[�k" from Brian Kernighan                                      
 *  Language: JAVA                                                                                                    
 *  Author: Finley at 2017-12-18 05:55                                      
 **********************************************************************************/
import java.util.Scanner;

public class a002 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		// ���y�X�J�Ʀr
        int a, b;
        // ���J�Ʀr��ia, b�e��
        
        while(input.hasNextInt()) {
            a = input.nextInt();
            b = input.nextInt();
            
            System.out.println(a + b);
        }

	}
	
}
