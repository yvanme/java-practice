package com.loong.单例模式.懒汉模式.线程安全模式;

public class Singleton {

    private Singleton(){}

    private static Singleton instance;

    private static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
