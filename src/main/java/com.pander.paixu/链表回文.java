package com.pander.paixu;

import com.alibaba.fastjson.JSON;

/**
 * @author: sunxuefei10
 * @date: 2021/3/23  10:56 上午
 */
public class 链表回文 {

    /**
     * 判断回文链表的大体思路，首先利用快慢指针找出中间节点，然后将中间节点之后的链表进行翻转，
     * 翻转之后进行对比，对比完成需要将链表数据还原
     */


    public static boolean sort(Node node){
        Node fast,slow ;
        fast = slow = node;
        while(fast!=null && fast.next!=null){
          slow = slow.next;
          fast = fast.next.next;
        }
        //这里可以根据fast节点是不是空来判断当前链表是奇数还是偶数,如果链表为偶数，则fast指向空，因为是从node节点的下两个节点，也就是第三个节点开始的
        if(fast != null){
            slow=slow.next;
        }
        System.out.println("slow::::::::"+JSON.toJSONString(slow));

        //得到中间点，然后对中间点之后的节点翻转，与头结点进行对比

        Node left = node;
        System.out.println("left:::::::::"+ JSON.toJSONString(left));
        Node right =reverse(slow);
        System.out.println("right:::::::"+JSON.toJSONString(right));
        while (right!=null){
            if(left.value != right.value){
                return false;
            }
            left=left.next;
            right=right.next;
        }
return true;

    }


    static Node reverse(Node node){
        Node pre=null;
        Node next = null;
        while(node != null){
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }



    public static void main(String[] args) {
        Node node5 =new Node(null,"5");
        Node node4 =new Node(node5,"4");
        Node node3 =new Node(node4,"3");
        Node node2 =new Node(node3,"4");
        Node node1 =new Node(node2,"5");

        System.out.println(JSON.toJSONString(node1));

        System.out.println(JSON.toJSONString(sort(node1)));

    }


    static class  Node{
        public Node next;
        public String value;

        public Node(Node next, String value) {
            this.next = next;
            this.value = value;
        }
    }
}


