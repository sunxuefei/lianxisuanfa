package com.pander.paixu.树;

import java.util.ArrayList;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  7:11 下午
 */
public class 二叉树和为某一值的路径 {


    /**
     * 要将某一个分支的和进行累加，需要使用一个list进行保存，
     * 然后是前序遍历的变种，需要注意的是需要还原list的现场
     * @param root
     * @param target
     * @return
     */


    public ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null){
            return result;
        }
        list.add(root.val);
        target-= root.val;
        if(target == 0 && root.left==null && root.right==null)
            result.add(new ArrayList<>(list));
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);
        return result;

    }
}
