package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/4/13  4:20 下午
 */
public class 两个链表合并 {
    /**
     * 两个链表合并有点跟归并排序最后的两个数组合并相似，都是先对比头结点，看看哪个小，然后依次向下遍历，
     * 直到最后一个node变为null，那么就把另一个node的剩余的节点挂在临时节点head的末尾就可以。
     */

    public static class Node{
        public int value;
        public 两个链表合并.Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    Node  soluction(Node l1,Node l2){
        Node head = new Node(-1);
        Node tail = head,pred1=l1,predl2 = l2;
        if(l1==null || l2 == null){
            return l1==null ? l2 : l1;
        }

        while (pred1 !=null && predl2 != null){
            if(pred1.value<predl2.value){
                tail.next=pred1;
                pred1 = pred1.next;
            }else{
                tail.next =predl2;
                predl2 = predl2.next;
            }
            tail = tail.next;
        }

        tail.next=pred1!=null ? pred1:predl2;
        return head.next;
    }








}
