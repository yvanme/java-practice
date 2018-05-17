package com.loong.io.sample.字符流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args ) {

        //创建要操作的文件路径和名称
        //其中，File.separator表示系统相关的分隔符，Linux下为：/  Windows下为：\\
        String path = "E:\\IO\\demo.txt";

        //由于IO操作会抛出异常，因此在try语句块的外部定义FileWriter的引用
        FileWriter w = null;
        try {
            //以path为路径创建一个新的FileWriter对象
            //如果需要追加数据，而不是覆盖，则使用FileWriter（path，true）构造方法
            w = new FileWriter(path);

            //将字符串写入到流中，\r\n表示换行想有好的
            w.write("Nerxious is a good boy\r\n");
            //如果想马上看到写入效果，则需要调用w.flush()方法
            //flush和close的区别：flush刷新后可以继续输入，close刷新后不能继续输入。
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //如果前面发生异常，那么是无法产生w对象的
            //因此要做出判断，以免发生空指针异常
            if(w != null) {
                try {
                    //关闭流资源，需要再次捕捉异常
                    w.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
