package com.loong.IO.字符流;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    private static Logger logger = Logger.getLogger(FileWriterTest.class);

    @Test
    public void testWriterFile(){

        FileWriter fileWriter =null;

        try {
            logger.info("使用FileWriter写入文件开始...");

            String path = "E:\\IO\\FileWriter.txt";

            fileWriter = new FileWriter(path);

            fileWriter.write("这是FileWriter写入测试文件");

            fileWriter.flush();

            logger.info("使用FileWriter写入文件结束...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
