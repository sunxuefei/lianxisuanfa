package com.pander.paixu;

import com.alibaba.fastjson.JSON;

/**
 * @author: sunxuefei10
 * @date: 2021/3/18  9:51 上午
 */
public class 随机快排 {


    /**
     *随机快排的思想跟荷兰旗思想很类似，都是随机找一个标准数，然后进行判断比这个数大的在右边，比这个数小的在左边，然后递归进行判断到最后一个
     */
    public static int[] netherlandsFlag(int[] arr,int L,int R){
        if(L>R){
            return new int[]{-1,-1};
        }
        if(L == R){
            return new int[]{L,R};
        }
        //定义左边界
        int less = L-1;
        //定义右边界
        int more = R;
        //定义起始位置
        int index = L;
        //当前进的位置一直不越界时
        while(index <more){
            //三种情况，当前位置跟指定元素相等时，则留在原地
            if(arr[index] == arr[R]){
                index++;
                //当前元素比制定元素小时，需要将当前位置元素跟左边界+1的位置进行互换，也就代表着左边界将当前元素扩进去了，因为从左向右进行排序，所以左边的都是
                //已经排好序的，需要将当前位置进行加1。
            }else if(arr[index]<arr[R]){
                swap(arr,index++,++less);
                //当前元素比指定元素大时，需要将右边界进行扩大，同时将元素进行替换，但是因为与右边界的那个数还没有进行对比，所以进行的位置不能加1
            }else{
                swap(arr,index,--more);
            }
        }
        //对比完之后，其实还有一个元素没有进行对比，就是最右边的那一个元素，因为最右面的这个元素就是基准值，所以需要将它跟右边界进行置换就可以。
        swap(arr,more,R);
        System.out.println(JSON.toJSONString(arr));
        //最后返回的就是左边界和右边界
        return new int[]{less+1,more};
    }



    public static void quickSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        process(arr,0,arr.length-1);
    }

    public static void process(int[] arr,int L,int R){
        if(L>=R){
            return;
        }
        //随机快排的思想就是随机将最右面的一个数与队列中的数进行置换
        swap(arr, (int) (Math.random()*(R-L+1)),R);
        //将相同的放在中间，小于的放在左边，大于的放在右边
        int[] equalArea = netherlandsFlag(arr,L,R);
        process(arr,L,equalArea[0]-1);
        process(arr,equalArea[1]+1,R);

    }


    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static void main(String[] args) {
        int[] aa ={1,6,4,3};
        quickSort(aa);
        System.out.println(JSON.toJSONString(aa));
    }

}
