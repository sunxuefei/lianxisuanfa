package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/4/1  10:37 上午
 */
public class 二叉树路径总和 {


    /**
     * 思路：关于二叉树，都可以使用递归的方式来实现，只不过是需要判断好条件和方式,这个题可以使用判断是叶子节点的时候，
     * 才进行累加值判断操作，其他情况只是仅仅将值进行累加。
     */

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;


        public TreeNode(int value) {
            this.val = value;
        }
    }

    public static boolean isEqual = false;


    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
         isEqual=false;
         process(root,0,targetSum);
         return isEqual;
    }

    public static void process(TreeNode node,int preSum,int k){
        //只有当每一条链表有相等的时候，会返回true
        if(node.left==null && node.right==null){
            if(preSum+node.val == k){
                isEqual=true;
                return;
            }
        }
        preSum += node.val;
        if(node.left!=null){
            process(node.left,preSum,k);
        }
        if(node.right!=null){
            process(node.right,preSum,k);
        }

    }


    public static void main(String[] args) {

    }

}
