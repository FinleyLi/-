package coocJava;

/*
 * 章節四 Variables
 * Problem:  Local Variable
 * Input: Null
 * Output: name; salary
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

import java.io.*;

public class InstanceVariablesEmployee {

	// this instance variable is visible for any child class.
	public String name;

	// salary variable is visible in Employee class only.
	private double salary;

	// The name variable is assigned in the constructor.
	public InstanceVariablesEmployee(String empName) {
		name = empName;
	}

	// The salary variable is assigned a value.
	public void setSalary(double empSal) {
		salary = empSal;
	}

	// This method prints the employee details.
	public void printEmp() {
		System.out.println("name  : " + name);
		System.out.println("salary :" + salary);
	}

	public static void main(String args[]) {
		/* Object creation */
		InstanceVariablesEmployee empOne = new InstanceVariablesEmployee("Ransika");
		/* Call class method to set employee's Salary */
		empOne.setSalary(1000);
		empOne.printEmp();
	}
}
