package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/4/1  2:22 下午
 */
public class 判断是否是搜索二叉树 {


    /**
     * 思路：判断是否是搜索二叉树，首先要了解搜索二叉树性质，左子树的最大节点比root节点小，右子树的最小节点比root节点大
     * .空数也是二叉搜索树，还有一个 需要排好序
     */

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static class Info {
        public boolean isBST;
        public int max;
        public int min;

        public Info(boolean is, int ma, int mi) {
            isBST = is;
            max = ma;
            min = mi;
        }
    }



    public Info process(TreeNode node){
        if(node == null){
            return null;
        }

        Info leftInfo = process(node.left);
        Info rightInfo = process(node.right);


        int max = node.val;
        int min =node.val;
        if(leftInfo != null){
            max = Math.max(leftInfo.max, max);
            min = Math.min(rightInfo.min, min);
        }

        if(rightInfo!=null){
            max = Math.max(rightInfo.max, max);
            min = Math.min(rightInfo.min, min);
        }

        boolean BST =false;

        boolean leftISBSt= leftInfo == null ? true : leftInfo.isBST;
        boolean rightISBST = rightInfo == null ?true : rightInfo.isBST;
        boolean leftMax = leftInfo == null ? true : (leftInfo.max<node.val);
        boolean rightMin = rightInfo == null ?true :(rightInfo.min> node.val);

        if(leftISBSt && rightISBST && leftMax && rightMin){
            BST = true;
        }

        return new Info(leftISBSt,max,min);


//        boolean isLeftBST = leftInfo.isBST;
//        boolean rightBST = rightInfo.isBST;
//
//        //判断是否左子节点的最小值小于当前节点值
//        boolean ismin = leftInfo.max < node.val;
//        boolean isMax = rightInfo.min> node.val;
//
//        return isLeftBST && rightBST && ismin && isMax;

    }





}
