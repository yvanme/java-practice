package com.loong.IO.字节流;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

    private static Logger logger = Logger.getLogger(FileInputStreamTest.class);

    @Test
    public void testFileInputStream(){

        FileInputStream fileInputStream =null;

        try {
            logger.info("读文件开始...");

            String path = "E:\\IO\\FileOutputStream.txt";

            fileInputStream = new FileInputStream(path);
            byte[] buf = new byte[1024];
            int temp =0;
            while ((temp = fileInputStream.read(buf))!= -1)
                logger.info(new String(buf,0,temp));

            logger.info("读文件结束...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
