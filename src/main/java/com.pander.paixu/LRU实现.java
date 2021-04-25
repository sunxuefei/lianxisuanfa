package com.pander.paixu;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: sunxuefei10
 * @date: 2021/3/24  1:48 下午
 */
public class LRU实现 {

    /**
     * 淘汰最久没有被使用的数据，不需要判断次数，将所有的get请求放入一个队列中，放入的时候需要判断是否需要删除，不需要删除的时候直接放入头结点之后，查询的时候需要将每次查询的几点抽离处理，然后放入头结点
     */

    static class Node {
        int key,val;
        Node prev,next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }


    private Map<Integer,Node> map = new HashMap<>();

    private Node head = new Node(-1,-1);

    private Node tail = new Node(-1,-1);

    private int k;

    public int[] LRU(int[][] operators,int k){
        this.k = k;
        head.next = tail;
        tail.prev = head;
        int len = (int) Arrays.stream(operators).filter(x->x[0]==2).count();
        int res[] = new int[len];
        for(int i=0,j=0;i< operators.length;i++){
            if(operators[i][0] == 1){
                set(operators[i][1],operators[i][2]);
            }else{
                res[j++] = get(operators[i][1]);
            }
        }
        return res;
    }


    private void set(int key,int value){
        if(get(key)>-1){
            map.get(key).val=value;
        }else{
            if(map.size()==k){
                int rk = tail.prev.key;
                tail.prev.prev.next = tail;
                tail.prev = tail.prev.prev;
                map.remove(rk);
            }
            Node node =new Node(key,value);
            map.put(key,node);
            moveToHead(node);
        }
    }


    private int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            moveToHead(node);
            return node.val;
        }
        return -1;
    }

    private void moveToHead(Node node ){
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev=head;
    }


    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(format.format(new Date()));
    }

}
