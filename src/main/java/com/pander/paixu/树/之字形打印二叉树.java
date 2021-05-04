package com.pander.paixu.树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  10:24 上午
 */
public class 之字形打印二叉树 {


    /**
     * 之字形打印二叉树主要是需要定义两个栈来承接每一行的节点,是层序遍历的进化版
     *
     * 注意：在写的过程中遇到的问题，首先对于stack1和stack2的非空判断是if和else的，因为一次判断要走一行数据，不能在Stack2中判断
     * 在stack1添加了数据，紧接着就判断stack1不为空，应该下一次才能走，因为是需要一行一行的。
     * 数据之后
     * @param pRoot
     * @return
     */
    public ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

    public Stack<TreeNode> stack1 = new Stack();

    public Stack<TreeNode> stack2 = new Stack();


    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null) {
            return new ArrayList<>();
        }
        stack2.push(pRoot);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            if (!stack2.isEmpty()) {
                while(!stack2.isEmpty()){
                    TreeNode node = stack2.pop();
                    list.add(node.val);
                    if(node.left!=null){
                        stack1.push(node.left);
                    }
                    if(node.right!=null){
                        stack1.push(node.right);
                    }
                }

            }
            else if (!stack1.isEmpty()) {
                while(!stack1.isEmpty()){
                    TreeNode node = stack1.pop();
                    list.add(node.val);
                    if(node.right!=null){
                        stack2.push(node.right);
                    }
                    if(node.left!=null){
                        stack2.push(node.left);
                    }
                }


            }
            arrayList.add(list);
            }
        return arrayList;
        }

    }

