package coocJava;

import java.io.*;
import java.util.*;

/*
 * 章節三 Object and Class
 * Problem: Accessing Instance and Methods MSI Laptop
 * Input: Null
 * Output: MSI Laptop 規格
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

public class InstanceMethodsMSI {

	public String name;
	int CPU;
	String NVIDIA;
	String Weight;
	double Price;

	// Laptops 類的建構式
	public InstanceMethodsMSI(String EMPname) {
		name = EMPname;
	}

	// 設置CPU的值
	public void empCPU(int empCPU) {
		CPU = empCPU;
	}

	/* 設置NVIDIA的值 */
	public void empNVIDIA(String empNVIDIA) {
		NVIDIA = empNVIDIA;
	}

	/* 設置Weight的值 */
	public void empWeight(String empWeight) {
		Weight = empWeight;
	}

	/* 設置Price的值 */
	public void empPrice(double empPrice) {
		Price = empPrice;
	}

	/* 列印訊息 */
	public void printLaptops() {
		System.out.println("名字:" + name);
		System.out.println("i7:" + CPU);
		System.out.println("顯示卡:" + NVIDIA);
		System.out.println("重量:" + Weight);
		System.out.println("售價:" + Price);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 使用構造器創建兩個對象 */
		InstanceMethodsMSI empOne = new InstanceMethodsMSI("【MSI 微星】PS63");
		InstanceMethodsMSI empTwo = new InstanceMethodsMSI("【MSI 微星】PS42");

		// 調用兩個對象的成員方法
		empOne.empCPU(8565);
		empOne.empNVIDIA("GeForce GTX 1050");
		empOne.empWeight("1.6 kg");
		empOne.empPrice(43900);
		empOne.printLaptops();

		empTwo.empCPU(8565);
		empTwo.empNVIDIA("GeForce MX250");
		empTwo.empWeight("1.19 kg");
		empTwo.empPrice(42900);
		empTwo.printLaptops();

	}

}
