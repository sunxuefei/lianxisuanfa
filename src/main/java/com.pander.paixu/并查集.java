package com.pander.paixu;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * @author: sunxuefei10
 * @date: 2021/5/8  3:08 下午
 */
public class 并查集 {

    /**
     * 并查集就是一种数据结构，提供isSameSet判断是否是同一集合，unionSet将数据合并为一个集合
     * 其实就可以将每一个元素先作为一个集合指向自己
     */

    public static class Node<V>{
        public V value;

        public Node(V value) {
            this.value = value;
        }
    }

    public static class UnionSet<V>{

        //从值找到当前node节点
        public HashMap<V,Node<V>> nodes;
        //当前节点对应父节点
        public HashMap<Node<V>,Node<V>> parents;
        //当前最顶点节点的节点数
        public HashMap<Node<V>,Integer> sizeMap;

        public UnionSet(List<V> values){
            for(V cur : values){
                Node<V> node = new Node<>(cur);
                nodes.put(cur,node);
                parents.put(node,node);
                sizeMap.put(node,1);
            }
        }

        //从cur开始一直往上找，找到不能再往上的代表点，返回
        public Node<V> findFather(Node<V> cur){
            Stack<Node<V>> path = new Stack<>();
            while(cur!=parents.get(cur)){
                path.push(cur);
                cur = parents.get(cur);
            }

            while(path!=null){
                parents.put(path.pop(),cur);
            }
               return cur;
        }

        public boolean isSameSet(V a,V b){
            if(!nodes.containsKey(a) || !nodes.containsKey(b)){
                return false;
            }
            Node aa = nodes.get(a);
            Node bb = nodes.get(b);
            return findFather(aa) == findFather(bb);
        }

        public void unionSet(V a,V b){
            if(!nodes.containsKey(a) || !nodes.containsKey(b)){
                return;
            }
            Node<V> nodeA = findFather(nodes.get(a));
            Node<V> nodeB = findFather(nodes.get(b));

            if(nodeA!=nodeB){
                int aSize = sizeMap.get(nodeA);
                int bSize = sizeMap.get(nodeB);
                Node<V> big =  aSize>bSize  ? nodeA : nodeB;
                Node<V> small = big == nodeA ? nodeB : nodeA;
                parents.put(small,big);
                sizeMap.put(big,aSize+bSize);
                sizeMap.remove(small);
            }
        }


    }



}
