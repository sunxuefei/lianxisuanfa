package com.pander.paixu.链表;

/**
 * @author: sunxuefei10
 * @date: 2021/5/2  2:11 下午
 */
public class 合并两个排序链表 {


    /**
     * 合并排序列表
     * 多个排序列表的时候可以使用优先队列，每次出去一个节点，然后在向优先队列添加一个节点
     * 合并两个排序列表可以直接进行比较，找出一个头结点小的链表，然后在一次比较
     * 跟归并排序的merge操作比较类似
     * @param list1
     * @param list2
     * @return
     */


    public ListNode Merge(ListNode list1,ListNode list2) {
        /**
         * 这个封装链表要注意的是，需要有一个节点承载着链表的向下移动，因为移动到最后你得到的是链表的最后一个节点
         * 所以说你要有一个节点是头结点保持不动，但是有另一个节点有着你头结点的引用向下进行移动，移动完成之后，这个节点的使命就完成了
         */
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while(list1 !=null && list2 !=null){
            if(list1.val< list2.val){
                cur.next=list1;
                list1=list1.next;
            }else {
                cur.next=list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1!=null){
            cur.next=list1;
        }
        if(list2!=null){
            cur.next=list2;
        }
        return head.next;
    }



    }
