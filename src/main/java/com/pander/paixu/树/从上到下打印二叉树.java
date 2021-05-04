package com.pander.paixu.树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  4:26 下午
 */
public class 从上到下打印二叉树 {


    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode cur = null;
        while(!queue.isEmpty()){
            cur = queue.poll();
            list.add(cur.val);
            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.right !=null){
                queue.add(cur.right);
            }
        }

        return list;
    }

}
