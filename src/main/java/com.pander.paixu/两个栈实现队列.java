package com.pander.paixu;

import java.util.Stack;

/**
 * @author: sunxuefei10
 * @date: 2021/3/30  7:48 下午
 */
public class 两个栈实现队列 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public void push(int value){
        stack1.push(value);
    }

    public int pop(){
        if(stack1==null && stack2 == null){
            throw new RuntimeException("stack is null");
        }
        if(stack2 == null && stack1!=null){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    public static void main(String[] args) {

    }
}
