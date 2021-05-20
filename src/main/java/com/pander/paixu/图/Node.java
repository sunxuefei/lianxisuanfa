package com.pander.paixu.图;

import java.util.ArrayList;

/**
 * @author: sunxuefei10
 * @date: 2021/5/10  10:13 上午
 */
public class Node {
    //node的编号
    public int value;
    //入度的数量
    public int in;
    //出度的数量
    public int out;
    //出度的相邻节点
    public ArrayList<Node> nexts;

    //与节点相关的边
    public ArrayList<Edge> edges;


}
