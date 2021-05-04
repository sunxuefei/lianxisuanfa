package com.pander.paixu.链表;

import java.util.ArrayList;

/**
 * @author: sunxuefei10
 * @date: 2021/5/2  2:10 下午
 */
public class 从尾到头打印链表 {
    /**
     * 从尾到头打印链表需要使用栈的思想，先进后出
     * @param listNode
     * @return
     */


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> list = new ArrayList<>();
        if(listNode == null){
            return list;
        }

        while(listNode!=null){
            list.add(0, listNode.val);
            listNode=listNode.next;
        }
        return list;
    }



}
