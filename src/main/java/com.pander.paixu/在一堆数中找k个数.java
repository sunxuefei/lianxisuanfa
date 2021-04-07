package com.pander.paixu;

import com.alibaba.fastjson.JSON;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: sunxuefei10
 * @date: 2021/3/30  4:59 下午
 */
public class 在一堆数中找k个数 {

    /**
     * 主要的解决思维就是构建成最大堆或者最小堆，然后根据堆去顶去判断数据，比堆顶大的直接舍弃，比堆顶小的需要替换，然后大的舍弃
     * 因为身下的n-k个元素全是堆顶了，所以剩下的就是k个最小元素
     */


    public static int[] sort(int[] list,int k){
        if(k>list.length || k== 0){
            return null;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for(int i=0;i<list.length;i++){
            if(queue.size()!=k){
                queue.offer(list[i]);
            }else if(queue.peek()>list[i]){
                queue.poll();
                    queue.offer(list[i]);

            }
        }
        System.out.println(JSON.toJSONString(queue));
        int [] ss =new int[k];
        for(int s = 0 ;s<  queue.size();s++){
            System.out.println(queue.peek());
            System.out.println(JSON.toJSONString(queue));
//            ss[s]= queue.poll();
        }
         return ss;

    }


    public static void main(String[] args) {
        int[] ss ={1,3,5,3,2,1,6};
        System.out.println(JSON.toJSONString(sort(ss,4)));
    }
}
