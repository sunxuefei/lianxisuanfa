package com.pander.paixu;

import com.alibaba.fastjson.JSON;

/**
 * @author: sunxuefei10
 * @date: 2021/3/11  4:09 下午
 */
public class 选择排序 {

    /**
     * 选择排序大体与冒泡排序是类似的，但是冒泡排序是相邻两个值比较，然后找出来的最大值
     * 而选择排序是拿出第一个值当做最小值，然后与后面的进行对比，找出最小值，依次运行排好序
     * @param list
     */
    public static void sort(int[] list){
        if(list == null || list.length<2){
            return;
        }
        for(int i=0;i<list.length;i++){
            int minIndex =list[i] ;
            for(int j=i+1;j<list.length;j++){
                if(minIndex>list[j]){
                    int temp = list[j];
                    list[j] = minIndex;
                    minIndex = temp;
                }
            }
            list[i] = minIndex;
        }
        System.out.println(JSON.toJSONString(list));
    }


    public static void main(String[] args) {
        int[] aa ={1,3,2,5,4,6};
        sort(aa);
    }
}
