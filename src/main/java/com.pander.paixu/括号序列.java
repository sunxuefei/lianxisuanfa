package com.pander.paixu;

import java.util.Stack;

/**
 * @author: sunxuefei10
 * @date: 2021/4/25  6:32 下午
 */
public class 括号序列 {


    /**
     * 判断括号序列可以直接使用一个栈来保存数据，需要涉及的是左括号必须有一个正常的右括号与之对应
     *
     *
     */

    public boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            if(stack.empty()){
                stack.push(s.charAt(i));
                continue;
            }

            if(s.charAt(i)==']' && stack.peek()=='['){
                stack.pop();
            }else if(s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            }else if(s.charAt(i)=='}' && stack.peek() == '{'){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
