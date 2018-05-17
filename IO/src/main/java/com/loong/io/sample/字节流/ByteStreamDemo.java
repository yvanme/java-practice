package com.loong.io.sample.字节流;

import java.io.*;

public class ByteStreamDemo {

    public static void main(String args[])throws IOException {

        //创建一个大小为12字节的缓冲区
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);

        while( bOutput.size()!= 10 ) {
            // 获取用户输入值
            bOutput.write(System.in.read());
        }

        byte b [] = bOutput.toByteArray();
        System.out.println("PrintWriterDemo the content");
        for(int x= 0 ; x < b.length; x++) {
            // 打印字符
            System.out.print((char)b[x]  + "   ");
        }
        System.out.println("   ");

        int c;

        ByteArrayInputStream bInput = new ByteArrayInputStream(b);

        System.out.println("Converting characters to Upper case " );
        for(int y = 0 ; y < 1; y++ ) {
            while(( c= bInput.read())!= -1) {
                System.out.println(Character.toUpperCase((char)c));
            }
            bInput.reset();
        }
    }
}
