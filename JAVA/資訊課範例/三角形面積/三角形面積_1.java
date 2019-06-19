import java.util.*;

//Compiler version JDK 11.0.2

class D
{   
    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);

        //輸入 底
        int X = input.nextInt();

        //輸入 高
        int Y = input.nextInt();
        
        //面積 = ( 底*高 )/2
        int Z = X*Y/2;
        
        //輸出 面積
        System.out.println(Z);
        
    }
}
