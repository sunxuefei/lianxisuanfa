package com.pander.paixu.树;

import java.util.Stack;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  11:05 上午
 */
public class 二叉树的非递归遍历 {

    /**
     * 二叉树的非递归遍历，主要是压栈的过程需要自己去实现，头绪遍历，头左右，需要先将头结点每次先拿出来，然后在打印左节点和右节点
     * 后序遍历，可以看作是头右左，就是压入头结点后面将左换成了右。
     * 中序遍历比较麻烦，需要将元素压入到最左，然后打印头结点，在右节点继续压入左节点的操作。
     * 属于深度优先遍历
     */

    public void preInOrder(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
    }

}
