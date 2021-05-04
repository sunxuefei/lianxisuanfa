package com.pander.paixu.树;

import java.util.Stack;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  10:56 上午
 */
public class 二叉搜索树的第k个节点 {

    /**
     * 二叉树的中序遍历就是排好序的值
     * @param pRoot
     * @param k
     * @return
     */

    TreeNode KthNode(TreeNode pRoot, int k) {

        if(pRoot ==null || k<=0){
            return  null;
        }
        TreeNode cur = pRoot;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || cur!=null ){
            if(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                if(--k==0){
                    return cur;
                }
                cur = cur.right;

            }
        }
        return null;
    }


}
