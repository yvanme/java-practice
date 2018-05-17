package com.loong.io.sample.字节流;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void readByBufferedInputStream() throws IOException {
        File file = new File( "d:/test.txt");
        byte[] byteArray = new byte[( int) file.length()];
        //可以在构造参数中传入buffer大小
        InputStream is = new BufferedInputStream( new FileInputStream(file),2*1024);
        int size = is.read( byteArray);
        System.out.println( "大小:" + size + ";内容:" + new String(byteArray));
        is.close();
    }
}
