package com.pander.paixu;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

/**
 * @author: sunxuefei10
 * @date: 2021/3/26  5:30 下午
 */
public class 之字形打印 {


    /**
     * 之字形打印就是按层打印的变种，需要两个栈来保存
     */


    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }



    public static ArrayList<ArrayList<Integer>> process(Node node) {
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        if(node == null)
            return list;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack2.add(node);
        while(!stack2.isEmpty() || !stack1.isEmpty()){
            ArrayList<Integer> subList = new ArrayList<>();
            if(!stack2.isEmpty()){
                while(!stack2.isEmpty()){
                    Node curNode = stack2.pop();
                    subList.add(curNode.value);
                    if(curNode.left!=null )
                        stack1.add(curNode.left);
                    if(curNode.right != null)
                        stack1.add(node.right);
                }
                list.add(subList);
            }else{
                while(!stack1.isEmpty()){
                    Node curNode1 = stack1.pop();
                    subList.add(curNode1.value);
                    if(curNode1.right != null)
                        stack2.add(curNode1.right);
                    if(curNode1.left!=null)
                        stack2.add(curNode1.left);
                }
                list.add(subList);
            }
        }
        return list;
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

