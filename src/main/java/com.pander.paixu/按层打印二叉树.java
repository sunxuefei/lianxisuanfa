package com.pander.paixu;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: sunxuefei10
 * @date: 2021/3/26  5:09 下午
 */
public class 按层打印二叉树 {



    /**
     * 思路就是用一个list集合装载每一层的数组，接下来要做的就是按层遍历将元素放入数组中
     * 如何放，需要先将头结点放入栈中，然后头结点出栈，左节点右节点依次入栈，然后左节点出栈，左节点的左节点和右节点入栈
     */

    /**
     * 之字形打印二叉树就是控制第一次从左边开始第二次从右边开始，就是for循环之后的操作
     */


    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }


    public static List<List<Integer>> process(Node node){
if(node == null){
    return null;
}
List<List<Integer>> ll =new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i =0 ;i<size;i++){
                Node curNode = queue.poll();
                //只需要添加元素的时候判断是放到前面还是后面
                list.add(curNode.value);
                if(curNode.left!=null){
                    queue.add(curNode.left);
                }
                if(curNode.right!=null){
                    queue.add(curNode.right);
                }
            }
            ll.add(0,list);
        }

        return ll;
    }



    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);

        System.out.println(process(head));

    }

}
