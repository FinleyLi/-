package coocJava;

/*
 * 章節六 解題工具
 * Problem: 轉置矩陣
 * Input: 陣列內容
 * Output: 矩陣的翻轉再旋轉
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

import java.util.Scanner;  
public class Main{  
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);      
        while(sc.hasNext()){  
            int n = sc.nextInt();  
            int m = sc.nextInt();  
            int arr[][] = new int[n][m];  
            for(int a=0;a<n;a++)  
                for(int b=0;b<m;b++){  
                    arr[a][b] = sc.nextInt();  
                }                     
            for(int a=0;a<m;a++){  
                for(int b=0;b<n;b++){  
                    if(b==0)  
                        System.out.print(arr[b][a]);  
                    else  
                        System.out.print(" "+arr[b][a]);  
                }  
                System.out.println();  
            }  
        }  
    }  
} 

/*
2 3
2 1 3
8 7 9

3 3
1 2 3
8 4 9
1 0 3

5 5
1 1 0 0 0
0 0 0 1 1
1 0 1 0 1
0 1 0 1 0
1 0 1 0 0
*/