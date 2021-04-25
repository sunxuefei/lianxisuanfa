package com.pander.paixu;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author: sunxuefei10
 * @date: 2021/4/13  4:50 下午
 */
public class K个有序链表合并 {
    /**
     * K个链表合并，思路就是可以使用有序队列PorityQueue，可以将所有的链表的头结点放进去，在定义一个比较函数，跟双链表
     * 的比较类似。
     */


    public static class Node{
        public int value;
        public K个有序链表合并.Node next;

        public Node(int value) {
            this.value = value;
        }
    }



    Node soluction(List<Node> list){

        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.value<o2.value){
                    return -1;
                }else if(o1.value==o2.value){
                    return 0;
                }else{
                    return 1;
                }
            }
        });

        for(Node n : list){
            queue.add(n);
        }
        Node head = new Node(-1);
        Node tail = head;
        while(!queue.isEmpty()){
            tail.next = queue.poll();
            tail = tail.next;
            queue.add(tail.next);
        }
        return head.next;
    }




}
