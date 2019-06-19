package coocJava;

/*
 * 章節六 解題工具
 * Problem: 堆疊
 * Input: offer
 * Output: poll
 * Author: Finley@ms.tsh.ttu.edu.tw
 * */

import java.util.LinkedList;
import java.util.Queue;
 
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll()); //回傳第一個元素，並在列隊中刪除
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element()); //回傳第一個元素，但不刪除
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //窺視第一個元素 
        for(String q : queue){
            System.out.println(q);
        }
    }
}