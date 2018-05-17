package com.loong.io.sample.字符流;

import java.io.*;

public class BufferedReaderDemo {

    public static void readByBufferedReader() throws IOException {
        File file = new File( "d:/test.txt");
        // 在字符流基础上用buffer流包装，也可以指定buffer的大小
        Reader reader = new BufferedReader( new FileReader(file),2*1024);
        char[] byteArray = new char[( int) file.length()];
        int size = reader.read( byteArray);
        System. out.println( "大小:" + size + ";内容:" + new String(byteArray));
        reader.close();
    }
}
