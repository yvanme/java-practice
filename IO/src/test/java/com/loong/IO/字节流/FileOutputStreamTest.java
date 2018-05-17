package com.loong.IO.字节流;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStreamTest {

    private static Logger logger = Logger.getLogger(FileOutputStreamTest.class);

    @Test
    public void testFileOutputStream(){

        FileOutputStream fileOutputStream =null;

        try {
            logger.info("写入文件开始...");

            String path = "E:\\IO\\FileOutputStream.txt";

            fileOutputStream = new FileOutputStream(path);

            byte[] strBytes = "这是FileOutputStream写入测试文件".getBytes();

            fileOutputStream.write(strBytes);


            logger.info("写入文件结束...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
