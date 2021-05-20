package com.pander.paixu.图;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: sunxuefei10
 * @date: 2021/5/10  10:16 上午
 */
public class Graph {
    //节点编号和节点的关系
    public HashMap<Integer,Node> nodes;

    //边
    public HashSet<Edge> edges;


    public Graph(){
        nodes=new HashMap<>();
        edges = new HashSet<>();
    }

}
