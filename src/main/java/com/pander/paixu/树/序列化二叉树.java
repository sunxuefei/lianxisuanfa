package com.pander.paixu.树;

/**
 * @author: sunxuefei10
 * @date: 2021/5/1  7:18 下午
 */
public class 序列化二叉树 {

    String Serialize(TreeNode root) {
        if(root == null){
            return "#";
        }else{
            return root.val+","+Serialize(root.left)+","+Serialize(root.right);
        }

    }

    int index = -1;

    TreeNode Deserialize(String str) {
       String[] s = str.split(",");
       index++;
       int len = s.length;
       if(index >len){
           return null;
       }
       TreeNode treeNode = null;
       if(!s[index].equals("#")){
           treeNode = new TreeNode(Integer.parseInt(s[index]));
           treeNode.left = Deserialize(str);
           treeNode.right = Deserialize(str);
       }
       return treeNode;
    }


}
