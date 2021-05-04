package com.pander.paixu.树;

import java.util.Stack;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  2:38 下午
 */
public class 二叉树的镜像 {

    /**
     * 二叉树的镜像，主要是考察每一个节点都需要左子树和右子树进行调换，可以使用递归也可以使用非递归
     * @param pRoot
     * @return
     */


    public TreeNode Mirror (TreeNode pRoot) {
        if(pRoot==null){
            return null;
        }
//        TreeNode cur = pRoot;
//        cur.right = Mirror(cur.left);
//        cur.left = Mirror(cur.right);
//        return cur;
        TreeNode left = Mirror(pRoot.left);
        TreeNode right = Mirror(pRoot.right);
        pRoot.left =right;
        pRoot.right = left;
        return pRoot;
    }

    /**
     * 中序遍历的时候进行变换
     * @param pRoot
     * @return
     */
    public TreeNode middleMirror(TreeNode pRoot){
        if(pRoot ==null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node =pRoot;
        while(!stack.isEmpty() || node!=null){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else{
                node = stack.pop();
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                node = node.left;
            }
        }
        return pRoot;
    }

}
