package com.pander.paixu.链表;

/**
 * @author: sunxuefei10
 * @date: 2021/5/2  2:11 下午
 */
public class 链表中倒数第k个节点 {

    /**
     * 要计算链表中倒数第k个节点，其实可以使用双指针
     * 一个指针先走k步
     * 另一个指针开始出发，当第一个指针到达终点的时候，第二个指针就是倒数第k个元素
     * @param pHead
     * @param k
     * @return
     */


    public ListNode FindKthToTail (ListNode pHead, int k) {

        int fast = k;
        ListNode knode=pHead;
        while(fast>0){
            if(knode==null){
                return null;
            }else {
                fast--;
                knode = knode.next;
            }
        }

        while(knode!=null){
            pHead = pHead.next;
            knode =knode.next;
        }
        return pHead;


    }



}
