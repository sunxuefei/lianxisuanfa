package com.pander.paixu.数组;

/**
 * @author: sunxuefei10
 * @date: 2021/5/3  2:10 下午
 */
public class 斐波那契数列 {

    public int Fibonacci(int n) {

//        if(n<=1){
//            return n;
//        }
//        return Fibonacci(n-1)+Fibonacci(n-2);

//        int ans[] = new int[40];
//        ans[0] =0;
//        ans[1] =1;
//        for(int i=2;i<=n;i++){
//            ans[i]=ans[i-1]+ans[i-2];
//        }
//        return  ans[n];


        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int a =0;
        int b =1;
        int sum =0;
        for(int i=2;i<=n;i++){
            sum = a+b;
            a=b;
            b=sum;
        }
        return sum;
    }


}
