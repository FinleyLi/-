// Life and Work about T.W.
// https://cookieandcoketw.blogspot.tw/2012/02/java-a005-eva_7290.html

import java.util.Scanner;
public class A_Series {

	static String strA; // �ŧi�����ܼ�strA�e�����r��
	static int intA; // �ŧi�����ܼ�intA�e�����Ʀr

	/**********************************************************************************
	 *  Problem: a001 "���o"                                     
	 *  cin: World
	 *  cout: Hello, World                                                                                                    
	 *  Author: Finley at 2017-11-08 16:42                                      
	 **********************************************************************************/
    public static void a001() {
        Scanner input = new Scanner(System.in);
        // �Nclass���OScanner����Ƭ�object����input
        
        while(input.hasNext()) {
        	strA = input.nextLine();
            // ��C�@�檺��Jinput��iS�r��e��
            System.out.println("hello, " + strA);
            // �C�Lhello, s
        }
    }
    
    /**********************************************************************************
     *  Problem: a002 "²���[�k"                                    
     *  cin: 5 + 10
	 *  cout: 15                                                                                                  
     *  Author: Finley at 2017-12-18 15:35                                      
     **********************************************************************************/
    public static void a002() {
    	Scanner input = new Scanner(System.in);
    	// �Nclass���OScanner����Ƭ�object����input
        int b; //�ϰ��ܼơA�d��ba002()����
        // �ŧib�e�������
        
        while(input.hasNextInt()) {
        	intA = input.nextInt();
        	b = input.nextInt();
            // ��U�@�Ӿ�ƪ���Jinput��ia�Ʀr�e��, �U�@�Ӿ�ƪ���Jinput b�Ʀr�e��
            
            System.out.println(intA + b);
            // �C�La + b�����G
        }
    }
    
    /**********************************************************************************
     *  Problem: a003 "����k�v�e�R�N"                                    
     *  cin: 9 24
	 *  cout: (9 * 2 + 24)%3 select ���q�B�N�B�j�N                                                                                                      
     *  Author: Finley at 2017-12-18 15:55                                      
     **********************************************************************************/

    public static void a003() {
    	Scanner input = new Scanner(System.in);
    	// �Nclass���OScanner����Ƭ�object����input
        
        while (input.hasNext()) {
        	strA = input.nextLine();
            // ��C�@�檺��Jinput��istrA�r��e��
            String [] strArray = strA.split(" "); //�ϰ��ܼơA�d��bwhile()����
            // �ŧistr�e�����}�C�A���e��strA�H" "����
            
            int a = Integer.parseInt(strArray[0]); //�ϰ��ܼơA�d��bwhile()����
            // �N�r��ѪR���Q�i���ơA�qstr[0]���X�r���ର���
            int b = Integer.parseInt(strArray[1]); //�ϰ��ܼơA�d��bwhile()����
            // �N�r��ѪR���Q�i���ơA�qstrArray[1]���X�r���ର���
            int c = (a * 2 + b)%3; //�ϰ��ܼơA�d��bwhile()����
            // �ŧic�e�����Ʀr �A (a * 2 + b)/3���l��
            
            if(c == 0)
                System.out.println("���q");
            	// �l��c��0�A��X"���q"
            if(c == 1)
                System.out.println("�N");
            	// �l��c��1�A��X"�N"
            if(c == 2)
                System.out.println("�j�N");
            	// �l��c��2�A��X"�j�N"
        }
    }
    
    /**********************************************************************************
     *  Problem: a004 "��媺�D�B"                                    
     *  cin: 1977
	 *  cout: ���~
	 *  PS: �褸�~�Q4�㰣�B���Q100�㰣�A�γQ400�㰣�̧Y���|�~                                                                                                      
     *  Author: Finley at 2017-12-26 15:19                                      
     **********************************************************************************/
    public static void a004() {
        
    	Scanner input = new Scanner(System.in);
    	// �Nclass���OScanner����Ƭ�object����input
        
        while (input.hasNext()) {
        	intA = input.nextInt();
			// ��U�@�Ӿ�ƪ���Jinput��ia�Ʀr�e��
			
			//�褸�~�Q4�㰣�B���Q100�㰣�A�γQ400�㰣�̧Y���|�~
			if (((intA % 4) == 0 && (intA % 100) != 0) || (intA % 400) == 0)
				System.out.println("�|�~");
			else
				System.out.println("���~");
		}
    }

    public static void main(String[] argv) {

        a002();
        // ��ܰ��檺�D��

    }
	
}
