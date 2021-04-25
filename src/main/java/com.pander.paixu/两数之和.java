package com.pander.paixu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sunxuefei10
 * @date: 2021/4/25  3:55 下午
 */
public class 两数之和 {




    public int[] twoSum (int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<numbers.length;i++){
            if(map.get(target-numbers[i]) != null){
                return new int[]{map.get(target-numbers[i])+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[]{0,0};
    }

}
