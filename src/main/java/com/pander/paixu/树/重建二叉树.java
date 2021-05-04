package com.pander.paixu.树;

import java.util.Arrays;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  2:03 下午
 */
public class 重建二叉树 {

    /**
     * 重建二叉树，给的是前序遍历和中序遍历给的排序结果，进行重排序要注意的是理解前序遍历和中序遍历的意义，
     * 前序遍历，头结点然后左子树和右子树
     * 中序遍历，左子树头结点和右子树
     * 首先要根据前序遍历的头结点和前序中序的结果确认出左子树和右子树，然后进行递归建立这一课数
     * 但是递归建立树还是不太明白
     * @param pre
     * @param in
     * @return
     */

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || pre.length==0){
            return null;
        }
        //首先找到val值
        TreeNode root = new TreeNode(pre[0]);
        int index = 0;
        for(int i = 0;i<in.length;i++){
            if(in[i]==pre[0]){
                index = i;
                break;
            }
        }
        //找到root的左子树
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,index+1),
                                          Arrays.copyOfRange(in,0,index));
        //找到root的右子树
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,index+1,pre.length),
                                           Arrays.copyOfRange(in,index+1,in.length));
        return root;
    }


}
