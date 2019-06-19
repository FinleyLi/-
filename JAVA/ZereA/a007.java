//判斷質數
import java.util.Scanner;
import java.lang.Math.*;
 
public class a007
{      
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext())
    {
      int num = sc.nextInt();
      int sq = (int)Math.sqrt(num);
      boolean prime = true;
      
      for(int i = 2;i <= sq;++i)
      {
        if(num % i == 0)
        {prime = false;break;}
      }
      
      System.out.println(prime ? "質數" : "非質數");
      
    }
  }
}