package com.pander.paixu.二分;

/**
 * @author: sunxuefei10
 * @date: 2021/5/7  11:32 上午
 */
public class 两数相除 {


// 100/3
// 100>3 100>6 100>12 100>24 100>48 100>96 100<192 ---- 使用了 2^5 = 32 个3，还剩 100 - 96 = 4 需要被除
// 4>3 4<6                                         ---- 使用了 2^0 = 1  个3，还剩 4   - 3  = 1 需要被除
// 1<3                                             ---- 被除数小于除数，递归结束，总计使用了 33 个 3

    /**
     * 两数相除，可以理解为将除数不断地扩大为2倍，直到除数大于被除数，
     * 然后除数缩小一倍，将小于的那一部分继续相同的操作
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide(int dividend, int divisor) {
        if(divisor==1){
            return dividend;
        }
        if(divisor ==-1 && dividend==Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        if(dividend<0 && divisor<0){
            return process(Math.abs(dividend),Math.abs(divisor));
        }else if(dividend<0 || divisor<0){
            return -process(Math.abs(dividend),Math.abs(divisor));
        }else{
            return process(Math.abs(dividend),Math.abs(divisor));
        }

    }

    public int process(long dividend,long divisor){

        //特别要判断的是被除数比除数小的情况
        if(dividend<divisor){
            return 0;
        }

        long sum=divisor;
        long count =1;
        while(dividend>divisor){
            sum<<=1;
            count<<=1;
        }
        sum>>>=1;
        count >>>=1;
        return (int) (count+process(dividend-sum,divisor));
    }


    public static void main(String[] args) {
        int count =1;

        System.out.println(count<<=count);
        System.out.println(count>>>=count);
    }

}
