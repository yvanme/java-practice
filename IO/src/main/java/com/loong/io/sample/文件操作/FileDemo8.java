package com.loong.io.sample.文件操作;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        String path = File.separator + "opt" + File.separator;

        File f = new File(path);
        //调用下面的递归方法
        print(f);
    }

    //用递归的方式打印目录列表
    public static void print(File f) {
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for(File x : files) {
                print(x);
            }
        } else {
            System.out.println(f);
        }
    }
}
