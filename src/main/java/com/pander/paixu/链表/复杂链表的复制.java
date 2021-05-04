package com.pander.paixu.链表;

import java.util.HashMap;

/**
 * @author: sunxuefei10
 * @date: 2021/5/2  2:11 下午
 */
public class 复杂链表的复制 {


    /**
     * 对于这种情况的复制可以使用map来保存数据key是node，value也是node
     *
     * 不使用hash表，
     * @param pHead
     * @return
     */

    public RandomListNode Clone(RandomListNode pHead) {

        HashMap<RandomListNode,RandomListNode> map =new HashMap<>();
        RandomListNode cur = pHead;
        while(cur!=null){
            map.put(cur,new RandomListNode(cur.label));
            cur = cur.next;
        }
        cur = pHead;
        while(cur !=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(pHead);
    }






    public RandomListNode CloneWithOutMap(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode cur = pHead;
        RandomListNode next = null;
        // copy node and link to every node
        // 1 -> 2
        // 1 -> 1' -> 2
        while (cur != null) {
            // cur 老 next 老的下一个
            next = cur.next;
            cur.next = new RandomListNode(cur.label);
            cur.next.next = next;
            cur = next;
        }
        cur = pHead;
        RandomListNode curCopy = null;
        // set copy node rand
        // 1 -> 1' -> 2 -> 2'
        while (cur != null) {
            // cur 老
            // cur.next 新 copy
            next = cur.next.next;
            curCopy = cur.next;
            curCopy.random = cur.random != null ? cur.random.next : null;
            cur = next;
        }
        // head head.next
        RandomListNode res = pHead.next;
        cur = pHead;
        // split
        while (cur != null) {
            next = cur.next.next;
            curCopy = cur.next;
            cur.next = next;
            curCopy.next = next != null ? next.next : null;
            cur = next;
        }
        return res;
    }


}



