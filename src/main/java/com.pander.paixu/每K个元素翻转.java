package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/4/26  4:15 下午
 */
public class 每K个元素翻转 {


    public class Node {
    int val;
   Node next = null;

   public Node(int val){
       this.val = val;
   }

 }

    /**
     * 每k个元素进行链表反转，可以采用头插法，比如说k是3，就要看第2个元素和第三个元素就可以，第一个元素不需要翻转
     */

    public Node reverseKGroup (Node head, int k) {
        if(head == null || head.next==null || k==1){
            return head;
        }
        int length =0;
        Node res = new Node(0);
        res.next =head;


        Node pre =res;
        Node cur =head;
        Node temp =null;

        while(head!=null){
            length++;
            head=head.next;
        }

        for(int i=0;i<length/k;i++){
            for(int j =1;j<k;j++){
                temp = cur.next;
                //1->3
                cur.next = temp.next;
                //2->1
                temp.next = pre.next;
                //head->2
                pre.next = temp;
                //最后第一次执行完成之后变成head->2->1->3
            }
        pre = cur;
            cur=cur.next;

        }

return res.next;
    }




}
