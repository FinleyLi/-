public class Test {
   public static void main(String args[]){
      
      for(int x = 10; x < 20; x = x+1) {
         System.out.print("value of x : " + x );
         System.out.print("\n");
      }
       
      int [] numbers = {10, 20, 30, 40, 50};
 
      for(int Num : numbers ){
         System.out.print( Num );
         System.out.print(",");
      }
      System.out.print("\n");
      String [] names ={"James", "Larry", "Tom", "Lacy"};
      for( String Name : names ) {
         System.out.print( Name );
         System.out.print(",");
      }
   }
}
