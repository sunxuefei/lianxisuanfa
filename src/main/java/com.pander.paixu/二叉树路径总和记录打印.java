package com.pander.paixu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sunxuefei10
 * @date: 2021/4/1  2:49 下午
 */
public class 二叉树路径总和记录打印 {


    /**
     * 思路：将二叉树的所有符合总和结果的链路进行打印，跟之前做过的二叉树的链路总和计算差不多，而且跟二叉树按层遍历打印也差不多
     * 需要将符合结果的那个list<int>添加到队列中去,但是对于队列的传入需要清理现场
     */


    public static class TreeNode {
        int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }



      public List<List<Integer>> pathSum(TreeNode root, int targetSum){
          List<List<Integer>> ll = new ArrayList<>();
          if(root == null ){
              return ll;
          }
          List<Integer> list = new ArrayList<>();
         return   process(root,targetSum,0,list,ll);
      }



      public List<List<Integer>> process(TreeNode root, int targetSum,int preSum,List<Integer> list,List<List<Integer>> ll){
          if(root.left == null && root.right == null){
              if(root.val+preSum == targetSum){
                  list.add(root.val);
                  ll.add(copy(list));
                  //这里需要判断数据清
                  list.remove(list.size()-1);
                  return ll;
              }
          }

          list.add(root.val);
          preSum+=root.val;

          if(root.left!=null){
              process(root.left,targetSum,preSum,list,ll);
          }

          if(root.right!=null){
              process(root.right, targetSum, preSum, list,ll);
          }

          list.remove(root.val);

          return ll;
      }


      public static List<Integer> copy(List<Integer> list){
          List<Integer> l = new ArrayList<>();
          for(Integer  num : list){
              l.add(num);
          }
          return  l;
      }

        public static void main(String[] args) {
            System.out.println(Integer.MIN_VALUE);
        }



    }








}
