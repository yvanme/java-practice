package com.loong.io.sample.输入输出;

import java.io.*;
public class IOStreamLaw {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        //键盘的最常见写法
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("goods1.txt"),"UTF-8"));
        String line = null;
        while((line=bufr.readLine())!=null){
            if("over".equals(line)) break;
            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
    }


}
