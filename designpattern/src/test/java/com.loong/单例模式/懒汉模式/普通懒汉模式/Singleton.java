package com.loong.单例模式.懒汉模式.普通懒汉模式;

public class Singleton {

    private Singleton(){

    }
    private static Singleton instance =null;

    public static Singleton getInstance(){
        if(instance == null){
            instance =  new Singleton();
        }
        return instance;
    }
}
