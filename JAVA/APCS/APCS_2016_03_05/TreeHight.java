package APCS_20160305;

/*
 * Problem: 第4題血緣關係
 * Input: 第一行為n成員的個數；每行有整數a與b (0≤ a,b≤ n-1)，代表b是a的孩子。
 * Output: 最遠"血緣距離"
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

import java.util.HashMap; // 若要排序改用treeMap
import java.util.Scanner;

public class TreeHight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        // 若n = 1只會有壹層，n = 2只會有兩層
        if( n < 3 ) {
            System.out.println(n);
        } else{
            //https://www.nowcoder.com/questionTerminal/4faa2d4849fa4627aa6d32a2e50b5b25
            String result = "";
            // 樹的深度deep Map、節點孩子數量childNum Map
            HashMap<Integer, Integer> deep = new HashMap<>();
            HashMap<Integer, Integer> childNum = new HashMap<>();
            deep.put(0, 1);
            childNum.put(0, 0);
            // 默認樹的深度為1
            int max = 1;
            int myDeep = 0;
            for (int i = 0; i < n - 1; i++) {
                int parent = input.nextInt();
                int num = input.nextInt();
                // 不包含父節點或者孩子數目超過兩個，則跳過
                if (!deep.containsKey(parent) || childNum.get(parent) >= 2) {
                    continue;
                }
                // 樹的深度加一
                myDeep = deep.get(parent) + 1;
                // 子節點與樹的深度
                deep.put(num, myDeep);
                // 存父節點，其子節點數量加一
                childNum.put(parent, (childNum.get(parent) + 1));
                // 存子節點，其子節點數量為0
                childNum.put(num, 0);
                if (myDeep > max) {
                    max = myDeep;
                }
            }
            System.out.println(max);
        }
    }
}

/*
8
0 1
0 2
0 3
7 0
1 4
1 5
3 6
4
0 1
0 2
2 3
 */
