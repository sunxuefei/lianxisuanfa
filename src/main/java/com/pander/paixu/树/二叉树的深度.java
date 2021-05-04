package com.pander.paixu.树;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  5:39 下午
 */
public class 二叉树的深度 {


    /**
     * 求二叉树的深度，可以使用递归，只需要知道左子树的深度，右子树的深度，取其中的最大值加1
     * @param root
     * @return
     */

    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
