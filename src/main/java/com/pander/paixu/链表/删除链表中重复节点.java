package com.pander.paixu.链表;

/**
 * @author: sunxuefei10
 * @date: 2021/5/2  2:12 下午
 */
public class 删除链表中重复节点 {


    /**
     * 删除重复节点，可以先虚拟一个头结点，然后看接下来的节点和当前节点的值是否一样，一样的话直接将指针跳过去
     * @param pHead
     * @return
     */
    public ListNode deleteDuplication(ListNode pHead) {

        if(pHead ==null || pHead.next==null){
            return pHead;
        }
        ListNode head = new ListNode(-1);
        head.next = pHead;

        ListNode cur = head.next;
        ListNode pre = head;

        while(cur!=null){
            if(cur.next!=null && cur.val == cur.next.val){
                while(cur.next!=null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur=cur.next;
                pre.next = cur;
            }else {
                //说明没有节点值相同，可以将当前节点值略过去
                pre = cur;
                cur=cur.next;
            }
        }
        return head.next;
    }


}
