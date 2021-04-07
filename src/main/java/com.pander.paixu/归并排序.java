package com.pander.paixu;

import com.alibaba.fastjson.JSON;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author: sunxuefei10
 * @date: 2021/3/16  4:00 下午
 */
public class 归并排序 {


    /**
     * 归并排序，主要思路是把大的问题进行拆分，一拆为二，二拆为四，一直进行进行分裂到单个数进行对比
     */
    public  static void sort(int[] list,int left,int right){
        if(left == right){
            return;
        }
        int middle = left + ((right - left)>>1);
        sort(list,left,middle);
        sort(list,middle+1,right);
        merge(list,left,middle,right);
        System.out.println("list"+JSON.toJSONString(list));
    }

    public static void merge(int[] list,int left ,int middle, int right){
        int[] help = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = middle + 1;
        //保证左边或者右边不越界
        while(p1<= middle && p2<= right) {
            help[i++] = list[p1] <= list[p2] ? list[p1++] : list[p2++];
        }
        //说明左边没有merge完
        while(p1<=middle){
          help[i++] = list[p1++];
        }
        while(p2<=right){
          help[i++] = list[p2++];
        }
        System.out.println("help:"+JSON.toJSONString(help));

        for(int j =0;j<help.length;j++){
            list[left+j]  = help[j];
        }

    }



    public static void main(String[] args) {
//        int[] aa ={1,6,4,3};
//        sort(aa,0,3);

        System.out.println(LocalDate.now().plus(30, ChronoUnit.DAYS).atStartOfDay());

    }
}
