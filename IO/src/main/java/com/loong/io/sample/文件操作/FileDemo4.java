package com.loong.io.sample.文件操作;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        String path = File.separator + "home" + File.separator + "siu" +
                File.separator + "work" + File.separator;

        //path在此处作为父目录存在
        File f1 = new File(path,"/abc");
        File f2 = new File(path,"/d/e/f/g");

        //创建一个目录
        System.out.println(f1.mkdir());

        //递归创建目录
        System.out.println(f2.mkdirs());

    }
}
