import java.util.*;

//Compiler version JDK 11.0.2

public class Puppy{
   int puppyAge;
   public Puppy(String name){
      // 這個構造器僅有一個參數：name
      System.out.println("小狗的名字是 : " + name ); 
   }
 
   public void setAge( int age ){
       puppyAge = age;
   }
 
   public int getAge( ){
       System.out.println("小狗的年龄为 : " + puppyAge ); 
       return puppyAge;
   }
 
   public static void main(String[] args){
      /* 創建對象 */
      Puppy myPuppy = new Puppy( "tommy" );
      /* 通過方法來設定age */
      myPuppy.setAge( 2 );
      /* 調用另一個方法獲取age */
      myPuppy.getAge( );
      /*你也可以像下面這樣訪問成員變量 */
      System.out.println("变量值 : " + myPuppy.puppyAge ); 
   }
}