package com.loong.io.sample.文件操作;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        //listRoots()是一个静态方法，返回文件数组
        File[] files = File.listRoots();
        //foreach循环打印File对象
        for (File x : files) {
            System.out.println(x);
        }
    }
}
