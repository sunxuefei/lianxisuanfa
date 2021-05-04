package com.pander.paixu.链表;

/**
 * @author: sunxuefei10
 * @date: 2021/5/2  2:12 下午
 */
public class 两个链表的第一个公共节点 {


    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if(pHead1==null || pHead2==null){
            return null;
        }

        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while(l1!=l2){
            l1 = l1.next;
            l2 = l2.next;

            if(l1!=l2){
                if(l1==null){
                    l1=pHead2;
                }
                if(l2==null){
                    l2=pHead1;
                }
            }

        }
        return l1;
    }

}
