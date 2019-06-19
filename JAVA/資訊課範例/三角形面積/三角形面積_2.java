import java.util.*;

//Compiler version JDK 11.0.2

class D
{   
    public static void main(String args[])
    {   
        //System.out.println("Hello, Dcoder!");

        Scanner input = new Scanner(System.in);

        //輸入 底
        System.out.println("請輸入三角形底邊長度: ");
        float X = input.nextInt();

        //輸入 高
        System.out.println("請輸入三角形高度: ");
        float Y = input.nextInt();
                
        //面積 = ( 底*高 )/2
        float Z = X*Y/2;
        
        //輸出 面積
        System.out.println("三角形面積: " + Z + "(cm^2)");
        
    }
}