package com.loong.io.sample.字符流.实例;

import java.io.*;

public class TestDemo {
    public static void writeByteToFile() throws IOException {
        String hello= new String( "hello word!");
        byte[] byteArray= hello.getBytes();
        File file= new File( "d:/test.txt");
        //因为是用字节流来写媒介，所以对应的是OutputStream
        //又因为媒介对象是文件，所以用到子类是FileOutputStream
        OutputStream os= new FileOutputStream( file);
        os.write( byteArray);
        os.close();
    }
    public static void readByteFromFile() throws IOException{
        File file= new File( "d:/test.txt");
        byte[] byteArray= new byte[( int) file.length()];
        //因为是用字节流来读媒介，所以对应的是InputStream
        //又因为媒介对象是文件，所以用到子类是FileInputStream
        InputStream is= new FileInputStream( file);
        int size= is.read( byteArray);
        System. out.println( "大小:"+size +";内容:" +new String(byteArray));
        is.close();
    }
    public static void writeCharToFile() throws IOException{
        String hello= new String( "hello word!");
        File file= new File( "d:/test.txt");
        //因为是用字符流来读媒介，所以对应的是Writer，又因为媒介对象是文件，所以用到子类是FileWriter
        Writer os= new FileWriter( file);
        os.write( hello);
        os.close();
    }

    public static void readCharFromFile() throws IOException{
        File file= new File( "d:/test.txt");
        //因为是用字符流来读媒介，所以对应的是Reader
        //又因为媒介对象是文件，所以用到子类是FileReader
        Reader reader= new FileReader( file);
        char [] byteArray= new char[( int) file.length()];
        int size= reader.read( byteArray);
        System. out.println( "大小:"+size +";内容:" +new String(byteArray));
        reader.close();
    }

    public static void convertByteToChar() throws IOException{
        File file= new File( "d:/test.txt");
        //获得一个字节流
        InputStream is= new FileInputStream( file);
        //把字节流转换为字符流，其实就是把字符流和字节流组合的结果。
        Reader reader= new InputStreamReader( is);
        char [] byteArray= new char[( int) file.length()];
        int size= reader.read( byteArray);
        System. out.println( "大小:"+size +";内容:" +new String(byteArray));
        is.close();
        reader.close();
    }
}
