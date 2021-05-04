package com.pander.paixu.字符串;

/**
 * @author: sunxuefei10
 * @date: 2021/5/4  3:11 下午
 */
public class 反转字符串 {

    public String solve (String str) {
        // write code here
        if(str == null || str.length()==0){
            return "";
        }
        char[] chars = str.toCharArray();
        int i =0;
        int j = str.length()-1;
        while(i<=j){
            swap(chars,i,j);
            i++;
            j--;
        }
        return new String(chars);
    }


    public void swap(char[] str,int i,int j){
        char temp =str[i];
        str[i] = str[j];
        str[j] = temp;
    }

}
