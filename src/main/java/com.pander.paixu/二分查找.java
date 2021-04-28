package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/4/25  8:01 下午
 */
public class 二分查找 {


    /**
     * 二分查找主要针对于已经排好序的数组，然后进行划分
     */
    public int search (int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int middle = 0;

        while(low<high){
            middle = low+(high-low)>>1;
            if(nums[middle] == target){
                while(middle>0 && nums[middle-1]==target){
                    middle--;
                }
                return middle;
            }else if(nums[middle]>target){
                high=middle-1;
            }else{
                low=middle+1;
            }
        }
        return -1;

    }

}
