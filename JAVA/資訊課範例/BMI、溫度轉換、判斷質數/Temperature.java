//攝氏溫度轉換華氏溫度
import java.util.Scanner;
public class test
{
    public static void main (String args [])
    {
        double c = 0 ;
        double f = 0 ;
       
        System.out.print("請輸入攝氏溫度=>") ;
        Scanner n = new Scanner(System.in) ;
       
        c = n.nextInt() ;
        f = c * 9 / 5 + 32 ;
       
        System.out.print( f ) ;
    }
}