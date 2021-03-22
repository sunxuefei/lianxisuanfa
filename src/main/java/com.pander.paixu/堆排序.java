package com.pander.paixu;

import com.alibaba.fastjson.JSON;

/**
 * @author: sunxuefei10
 * @date: 2021/3/18  5:57 下午
 */
public class 堆排序 {

    /**
     * 堆排序其实就是一个完全的二叉树，其中每个父节点是大于每个子节点的叫做大根堆
     * 每个父节点小于子节点的叫做小根堆
     */

    /**
     * 取最大的一个元素其实就是取根节点，但是其他数的排序没必要重新排，只需要将最后的一个节点拿到根节点，然后再进行对比】
     * 取它子节点的最大值比较，小于的话跟这个节点进行替换，然后再进行比较，直到大于自己的子节点，
     */


    public static void heapSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }

        /**
         * 从数组的最后一个元素排序，每次都是从头元素不断地进行比较大小构建树
         */
        for(int i = arr.length-1;i>=0;i--){
            heapify(arr,i,arr.length);
        }


        //前一步构建完树，然后需要比较大小，比较大小的基本思路就是取出大根堆的根节点然后进行堆重排，再取根节点再重拍，每次都将最大值取出来完成排序。
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while(heapSize>0){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }
    }


    /**
     *
     * @param arr  数组
     * @param index  当前节点
     * @param heapSize 堆大小
     */
    public static void heapify(int[] arr,int index ,int heapSize){
        //当前节点的左边节点
       int left = index*2+1;
       //当当前节点的左节点小于堆大小的时候，一直迭代
       while(left<heapSize){
           //当右节点小于堆大小并且数组中右节点大于左节点，返回右节点，小于左节点，返回左节点值。
           int largest = left+1 < heapSize && arr[left+1] > arr[left] ? left+1 : left;
           //比较已经比出结果的左右节点跟当前节点相比。哪个大返回哪个节点。
           largest = arr[largest] > arr[index] ? largest : index;
           //如果当前节点就是最大节点直接返回
           if(largest == index){
               break;
           }
           //将当前节点与最大节点的值进行交换
           swap(arr,largest,index);
           //将代表当前最大节点的左子节点或者右子节点赋值给当前节点继续向下进行遍历构建大根堆，这里
           //为什么只需要取最大值进行判断就可以，因为之前的堆已经排好序，只需要将新添加进来的节点按照大根堆的规则进行排序就行
           index  = largest;
           left = index * 2 +1;
       }
    }


    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int []arr = {7,6,7,11,5,12,3,0,1};
        heapSort(arr);
        System.out.println(JSON.toJSONString(arr));
    }


}
