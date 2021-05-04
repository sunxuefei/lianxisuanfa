package com.pander.paixu.数组;

/**
 * @author: sunxuefei10
 * @date: 2021/5/3  10:38 上午
 */
public class 二维数组的查找 {

    /**
     * 可以使用二分法，二分法需要灵活运用，因为给出的二维数组从上到下是有序的，从左到又是有序的，
     * 这种情况就要想到二分法查找，可以使用左下的值，
     * 如果m<traget，说明这一列最大的值小于目标值，只能向右移一列
     * 当m》target，说明这一行的最小值已经大于这个目标值，只能上移一列
     * 当m=target ，直接返回
     * 这种情况每次都可以解决一行或者一列
     * @param target
     * @param array
     * @return
     */

    public boolean Find(int target, int[][] array) {

        //有多少行
        int rows = array.length;
        if(rows==0){
            return false;
        }
        //有多少列
        int cols = array[0].length;
        if(cols == 0){
            return  false;
        }
        int row = rows-1;
        int col = 0;
        while (row>=0 && col<cols){
            if(array[row][col] <target){
col++;
            }else if(array[row][col]>target){
row--;
            }else{
                return true;
            }
        }
        return false;
    }
}
