package com.pander.paixu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sunxuefei10
 * @date: 2021/4/25  4:15 下午
 */
public class 最长无重复子串 {

    /**
     *要计算最长无重复子串，需要两个指针，一个是开始指针，一个是无重复时结束指针，有一个最大max来保存数据
     */
    public int maxLength (int[] arr) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        int max=1;
        for(int start=0,end=0;end<arr.length;end++){
            if(map.containsKey(arr[end])){
                start = Math.max(start,map.get(arr[end])+1);
            }
            max = Math.max(max,end-start+1);
            map.put(arr[end],end);
        }
        return max;
    }


}
