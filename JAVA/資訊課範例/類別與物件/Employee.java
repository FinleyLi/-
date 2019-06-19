import java.io.*;
 
public class Employee{
   String name;
   int age;
   String designation;
   double salary;
   // Employee 類的構造器
   public Employee(String name){
      this.name = name;
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
}