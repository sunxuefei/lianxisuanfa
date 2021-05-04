package com.pander.paixu.链表;

/**
 * @author: sunxuefei10
 * @date: 2021/5/2  2:12 下午
 */
public class 链表中环的入口节点 {

    /**
     * 链表中环的入口地址可以使用快慢指针，先是快慢指针相交的那一个节点开始，然后快指针重新从头结点出发，
     * 再次相交就是链表中环入口位置
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {

        if(pHead == null || pHead.next==null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;

        while(fast !=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                fast = pHead;
                while (slow!=fast){
                    slow =slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }


}
