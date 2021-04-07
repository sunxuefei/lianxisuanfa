package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/3/31  2:27 下午
 */
public class 判断是否是完整二叉树 {

    /**
     * 判断是否是完整二叉树，一方面要看树高度差，另一方面要看是否具备左孩子和又孩子
     */

    public static class Node{
        public Node left;
        public Node right;
        public int value;

        public Node(int value){
            this.value=value;
        }
    }


    public static class Info{
        public int height;
        public boolean isBST;

        public Info(boolean isBST,int height){
            this.isBST=isBST;
            this.height=height;
        }
    }



    public int getHeight(Node node ){
        if(node == null){
            return 0;
        }
        return Math.max(getHeight(node.left),getHeight(node.right));
    }



    public Info process(Node node){
        if(node == null){
            return new Info(true,0);
        }
        Info leftInfo = process(node.left);
        Info rightInfo = process(node.right);
        int height = Math.max(leftInfo.height,rightInfo.height)+1;
        boolean isBanlances = leftInfo.isBST && rightInfo.isBST && ((leftInfo.height- rightInfo.height)<2);
        return new Info(isBanlances,height);
    }




    public static void main(String[] args){

    }

}
