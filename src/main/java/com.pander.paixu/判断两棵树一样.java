package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/3/31  2:39 下午
 */
public class 判断两棵树一样 {

    /**
     * 判断两颗数是否一样，只需要判断树不可以一个为空一个不为空，树的每个节点的值必须一样
     */
    public static class Node{
        public Node left;
        public Node right;
        public int value;

        public Node(int value){
            this.value=value;
        }
    }



    public boolean isSameTree(Node node1,Node node2 ){
        if(node1==null ^ node2==null){
             return false;
        }
        if(node1==null && node2 == null){
            return true;
        }
        return node1.value == node2.value && isSameTree(node1.left,node2.left) && isSameTree(node1.right,node2.right);
    }




    public static void main(String[] args) {

    }
}
