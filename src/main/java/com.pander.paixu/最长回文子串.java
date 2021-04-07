package com.pander.paixu;

/**
 * @author: sunxuefei10
 * @date: 2021/4/7  11:18 上午
 */
public class 最长回文子串 {


    public String process(String str){
        int len = str.length();
        if(len <2){
            return str;
        }
        int maxLen =1;
        String res = str.substring(0,1);
        for(int i = 0;i<len-1;i++){
            String oldStr = centerSpread(str,i,i);
            String evenStr = centerSpread(str,i,i+1);
            String maxLenStr=oldStr.length()>evenStr.length()?oldStr:evenStr;
            if(maxLenStr.length()>maxLen){
                maxLen=maxLenStr.length();
                res=maxLenStr;
            }
        }
        return res;
    }


    private String centerSpread(String str,int left,int right){
        int len = str.length();
        int i=left;
        int j = right;
        while(i>=0 && j<len){
            if(str.charAt(i)== str.charAt(j)){
                i--;
                j++;
            }else{
                break;
            }
        }
        return str.substring(i+1,j);
    }





}
