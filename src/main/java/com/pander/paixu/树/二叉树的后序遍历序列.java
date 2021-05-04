package com.pander.paixu.树;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  4:34 下午
 */
public class 二叉树的后序遍历序列 {

    /**
     * 二叉搜索树的特点
     * 左子树的最大节点小于根节点
     * 右子树的最小节点的大于根节点
     * 这个题后序遍历就说明最后一个节点是根节点
     * 可以判断小于根节点的是左子树
     * 大于根节点的是右子树
     * @param sequence
     * @return
     */

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null || sequence.length<=0){
            return false;
        }
        return isBST(sequence,0,sequence.length-1);
    }


    public boolean isBST(int [] sequence,int left,int end){
        if(left>=end){
            return true;
        }
        int p = left;
        while(sequence[p]<sequence[end]){
            p++;
        }
        int m = p;
        while(sequence[p]>sequence[end]){
            p++;
        }
        return p==end && isBST(sequence,0,m-1) && isBST(sequence,m,end-1);

    }



}
