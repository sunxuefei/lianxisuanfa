package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/3/17  2:29 下午
 */
public class 链表翻转 {

     //  head
    //   a    ->   b    ->  c  ->  null
    //   c    ->   b    ->  a  ->  null

    public static Node reverseLinkedList(Node node){
        Node pre = null;
        Node next = null;
        while(node != null){
            //将node后面的节点赋值给一个node，防止丢掉node后面的节点
            next = node.next;
            //将node的next节点指向pre节点
            node.next = pre;
            //将当前节点变为前节点
            pre = node;
            //代表将当前节点的写一个节点在进行翻转
            node = next;
        }
         return pre;
    }


}

class  Node{
    public int value;
    public Node next;

    public Node( int value){
        this.value = value;
    }

}
