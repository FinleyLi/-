import java.io.*;
public class Employee{

   public String name;
   int age;
   String designation;
   double salary;
   // Employee 類的構造器
   public Employee(String EMPname){
      name = EMPname;
   }
   // 設置age的值
   public void empAge(int empAge){
      age =  empAge;
   }
   /* 設置designation的值*/
   public void empDesignation(String empDesig){
      designation = empDesig;
   }
   /* 設置salary的值*/
   public void empSalary(double empSalary){
      salary = empSalary;
   }
   /* 列印訊息 */
   public void printEmployee(){
      System.out.println("名字:"+ name );
      System.out.println("年齡:" + age );
      System.out.println("職位:" + designation );
      System.out.println("薪水:" + salary);
   }

 
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