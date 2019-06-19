import java.io.*;
public class EmployeeTest{
 
   public static void main(String[] args){
      /* 使用構造器創建兩個對象 */
      Employee empOne = new Employee("RUNOOB1");
      Employee empTwo = new Employee("RUNOOB2");
 
      // 調用兩個對象的成員方法
      empOne.empAge(26);
      empOne.empDesignation("高級程序員");
      empOne.empSalary(1000);
      empOne.printEmployee();
 
      empTwo.empAge(21);
      empTwo.empDesignation("菜鳥程序員");
      empTwo.empSalary(500);
      empTwo.printEmployee();
   }
}