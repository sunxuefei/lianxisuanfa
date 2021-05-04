package com.pander.paixu.链表;

/**
 * @author: sunxuefei10
 * @date: 2021/5/2  2:11 下午
 */
public class 翻转链表 {


    /**
     * 翻转链表需要注意的就是需要有一个前节点、一个后节点
     * 但是要注意前节点和后节点的连接
     * @param head
     * @return
     */

    public ListNode ReverseList(ListNode head) {

        ListNode prev = null;
        ListNode next =null;
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return  prev;
    }




}
