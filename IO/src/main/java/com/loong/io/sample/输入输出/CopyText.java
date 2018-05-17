package com.loong.io.sample.输入输出;

import java.io.*;
import java.util.Scanner;

public class CopyText {
    public static void main(String[] args) throws IOException {
        sop("请输入要拷贝的文件的路径:");
        Scanner in = new Scanner(System.in);
        String source = in.next();
        sop("请输入需要拷贝到那个位置的路径以及生成的文件名:");
        String destination = in.next();
        in.close();
        CopyTextDemo(source,destination);

    }

    /*****************文件Copy*********************/
    private static void CopyTextDemo(String source,String destination) {

        try {
            FileWriter fw = new FileWriter(destination);
            FileReader fr = new FileReader(source);
            char []  buf = new char[1024];
            //将Denmo中的文件读取到buf数组中。
            int num = 0;
            while((num = fr.read(buf))!=-1) {
                //String(char[] value , int offest,int count) 分配一个新的String,包含从offest开始的count个字符
                fw.write(new String(buf,0,num));
            }
            fr.close();
            fw.close();
        }
        catch (IOException e) {
            sop(e.toString());
        }
    }



    /**********************Println************************/
    private static void sop(Object obj) {
        System.out.println(obj);
    }
}
