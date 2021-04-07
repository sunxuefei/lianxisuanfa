package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/3/25  10:04 上午
 */
public class 遍历二叉树 {

    /**
     * 二叉树前序遍历，就是先头结点再左右节点,还有一种理解是递归序，就是每个节点都会走过三次，前序遍历就是第一次出现就显示，中序遍历就是
     * 第二次出现就显示，后序遍历就是第三次出现就显示。
     */
    public static void preSort(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value);
        preSort(node.left);
        preSort(node.right);
    }

    /**
     * 中序遍历
     */
    public static void midSort(Node node){
        if(node == null){
            return;
        }
        midSort(node.left);
        System.out.println(node.value);
        midSort(node.right);
    }


    /**
     * 后序遍历
     * @param node
     */
    public static void endSort(Node node){
        if(node == null){
            return ;
        }
        endSort(node.left);
        endSort(node.right);
        System.out.println(node.value);
    }


    /**
     * 所有的递归都可以使用不递归来实现
     */




    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);

//        preSort(head);

//        head = new Node(1);
//        head.left = new Node(2);
//        head.right = new Node(3);
//        head.left.left = new Node(4);
//        head.right.left = new Node(5);
//        head.right.right = new Node(6);
//        head.left.left.right = new Node(7);
        midSort(head);

//        head = new Node(1);
//        head.left = new Node(1);
//        head.right = new Node(1);
//        head.left.left = new Node(1);
//        head.right.left = new Node(1);
//        head.right.right = new Node(1);
//        head.left.left.right = new Node(1);
//        endSort(head);

    }




  static  class Node{
        public Integer value;
        public Node left;
        public Node right;

        public Node(Integer value) {
            this.value = value;
        }
    }

}




