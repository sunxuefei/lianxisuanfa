package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/3/30  4:40 下午
 */
public class 链表是否有环 {

    //使用快慢指针解决
    public boolean hasCycle(链表回文.Node node){
        if(node == null){
            return false;
        }
        链表回文.Node fast = node;
        链表回文.Node slow = node;
        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            while(fast == slow){
                return true;
            }
        }
        return false;
    }
}
