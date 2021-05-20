package com.pander.paixu.图;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author: sunxuefei10
 * @date: 2021/5/10  10:37 上午
 */
public class 图的深度优先遍历 {

    /**
     * 图的深度优先遍历主要是使用栈，
     * 为什么栈会两次push，push之后break
     * 为什么添加一次就break，因为是深度优先遍历，需要将一个节点先走到底，然后再走其他节点
     * 为什么需要将它的父节点也添加到栈里面，因为他需要回退操作，当前节点没有子节点的时候，需要回到当前节点的父节点，然后再找父节点
     * 的第二个节点，找到之后，继续break，然后深度遍历父节点的第二个节点
     */

    public void dfs(Node node){
        Stack<Node> stack = new Stack<>();
        Set<Node> set = new HashSet<>();
        stack.push(node);
        set.add(node);

        while(!stack.isEmpty()){
            Node n = stack.pop();
            for(Node next : n.nexts){
                if(!set.contains(next)){
                    stack.push(n);
                    stack.push(next);
                    set.add(next);
                    break;
                }
            }
        }

    }

}
