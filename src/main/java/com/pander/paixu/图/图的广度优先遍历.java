package com.pander.paixu.图;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author: sunxuefei10
 * @date: 2021/5/10  10:26 上午
 */
public class 图的广度优先遍历 {

    /**
     * 广度优先遍历在二叉树中需要定义一个队列就可以，但是在图中需要定义一个set集合来防止重复遍历
     * @param node
     */

    public void bsf(Node node ){
        Queue<Node> queue = new LinkedList<>();
        Set<Node> set = new HashSet<>();
        queue.add(node);
        set.add(node);
        while(!queue.isEmpty()){
            Node n = queue.poll();
            set.add(n);
            if(n.nexts!=null){
                for(Node next : n.nexts){
                    if(!set.contains(next)){
                        queue.add(next);
                        set.add(next);
                    }
                }
            }
        }
    }



}
