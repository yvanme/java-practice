package com.loong.单例模式.饿汉模式.普通饿汉模式;

/**
 * 饿汉模式，线程安全，不过效率较低
 */
public class Singleton {
    /**
     * 将构造方法设为私有
     */
    private Singleton(){}

    private static Singleton instance = new Singleton();

    /**
     * 静态工厂方法
     * @return
     */
    public static Singleton getInstance(){
       return instance;
    }
}
