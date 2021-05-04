package com.pander.paixu.字符串;

/**
 * @author: sunxuefei10
 * @date: 2021/5/4  2:56 下午
 */
public class 替换空格 {


    public String replaceSpace (String s) {

        if(s==null || s.length()==0){
            return "";
        }
        return s.replaceAll(" ","%20");

    }

}
