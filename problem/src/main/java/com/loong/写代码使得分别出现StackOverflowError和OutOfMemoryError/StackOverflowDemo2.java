package com.loong.写代码使得分别出现StackOverflowError和OutOfMemoryError;

public class StackOverflowDemo2 {

    public static void main(String[] args) {
        method();
    }
    public static void method() {
        method();
    }

}
