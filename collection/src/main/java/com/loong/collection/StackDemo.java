package com.loong.collection;

/*

 * 堆栈：FILO 先进后出

 *

 * 队列：FIFO 先进先出

 *

 */

import java.util.Stack;

public class StackDemo{

    public static void main(String[] args) {

        Stack<String> stack=new Stack<String>();//创建一个空stack

        stack.push("aaa1");       //把项压入栈顶

        stack.push("aaa2");

        stack.push("aaa3");

        stack.push("aaa4");



        while(stack.size()>0){

            System.out.println(stack.pop());    //移除栈顶对象，并作为函数的值返回该对象

        }

    }

}
