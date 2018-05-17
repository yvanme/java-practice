package com.loong.io.sample.输入输出;

import java.io.*;

public class inToFile {
    /*================把键盘录入的数据存到一个文件中==============*/
    public static void inToFile() {
        //键盘的最常见的写法
        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        try {

            /*InputStream ips = System.in;        //从键盘读入输入字节流
            InputStreamReader fr = new InputStreamReader(ips);             //将字节流转成字符流
            bufr = new BufferedReader(fr);  */                 //将字符流加强，提升效率


            bufr = new BufferedReader(new InputStreamReader(System.in));            //匿名类。InputSteamReader:读取字节并将其解码为字符
            bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt")));     //OutputStreamWriter:要写入流中的字符编码成字节
            String line = null;
            while((line = bufr.readLine())!=null){
                if("over".equals(line)) break;
                bufw.write(line.toUpperCase());                     //打印
                bufw.newLine();                                     //为了兼容，使用newLine()写入换行符
                bufw.flush();                                       //必须要刷新。不然不会显示
            }
            if(bufw!=null) {
                bufr.close();
                bufw.close();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
