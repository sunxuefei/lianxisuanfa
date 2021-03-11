package com.pander.paixu;

import com.alibaba.fastjson.JSON;

/**
 * @author: sunxuefei10
 * @date: 2021/3/11  2:03 下午
 */
public class 冒泡排序 {

    /**
     * 冒泡排序：拿数跟其他所有的数进行对比，然后依次挑选出最大的数，对比的次数分别是n-1,n-2,n-3.....,1
     * 比较稳定，因为不管之前的顺序如何都需要一个一个进行对比
     * @param list
     * @return
     */
    public static int[] bubbleSort(int[] list){

        int temp;
        if(list==null || list.length<2){
            return list;
        }
        for(int i=0;i<list.length;i++){
           for(int j=i+1;j<list.length;j++){
               if(list[i]<list[j]){
                   temp = list[i];
                   list[i] = list[j];
                   list[j] = temp;
               }
           }
        }
        System.out.println(JSON.toJSONString(list));
        return list;
    }

    public static void main(String[] args) {
        int[] aa ={1,3,2,5,4,6};
        bubbleSort(aa);
    }

}
