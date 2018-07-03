package com.loong.接口和抽象类的区别;

public abstract class AbstractDemo {
    //public final String s="测试";
    public final static String s="测试";
    //可以有自己的实现
    public static int demo(){
        return 1;
    }
    //可以有构造器
    public AbstractDemo(){

    }
    //可以运行
    public static void main(String[] args) {
        System.out.println(demo());
    }
}
