package com.pander.paixu.树;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  5:42 下午
 */
public class 平衡二叉树 {


    /**
     * 判断是否是平衡二叉树，只需要判断左树是否是平衡二叉树，右树是否是平衡二叉树
     * @param root
     * @return
     */

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null){
            return true;
        }
       return isCT(root).isBanlance;

    }

    class  Info{
        public int height;
        public boolean isBanlance;

        public Info(int height,boolean isBanlance){
            this.height = height;
            this.isBanlance = isBanlance;
        }
    }

    public Info isCT(TreeNode node){
        if(node ==null){
            return new Info(0,true);
        }
        Info left = isCT(node.left);
        Info right = isCT(node.right);
        return new Info(Math.max(left.height,right.height)+1,
                left.isBanlance&&right.isBanlance&&
                        Math.abs(left.height- right.height)<2);
    }
}
