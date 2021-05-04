package com.pander.paixu.树;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  3:21 下午
 */
public class 树的子结构 {

    /**
     * 需要使用递归的思路来解答，满足是子结构的可以有几种情况、
     * 1.根节点的一部分
     * 2.左子节点的一部分
     * 3.右子节点的一部分
     * @param root1
     * @param root2
     * @return
     */

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }
        return helper(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);

    }

    public boolean helper(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        return root1.val == root2.val && helper(root1.left,root2.left) && helper(root1.right,root2.right);
    }

}
