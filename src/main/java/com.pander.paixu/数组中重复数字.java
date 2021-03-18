package com.pander.paixu;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: sunxuefei10
 * @date: 2021/3/17  4:22 下午
 */
public class 数组中重复数字 {
    public static int getRepeatNumber(int[] array) {
        // Judge the boundary of this problem
        int len = array.length;
        if (len == 0) {return -1;}
        Set<Integer> set = new HashSet<>();
        int i = 0;
        for(; i < len; i++) {
            if (array[i] >= len) {
                return -1;
            } else {
                if (set.contains(array[i])) {
                    break;
                } else {
                    set.add(array[i]);
                }
            }
        }
        if (i == len) {
            return -1;
        } else {
            return array[i];
        }
    }







    public static int getChongfu(int[] arr){
        int len = arr.length;
        if(len == 0){
            return -1;
        }
        int i = 0;
        Set<Integer> set =new HashSet<>();
        for(;i<len;i++){
            if(arr[i]>len){
                return -1;
            }
            if(set.contains(arr[i])){
                break;
            }else{
                set.add(arr[i]);
            }
        }
        return arr[i];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(getChongfu(arr));
    }


}
