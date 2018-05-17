package com.loong.IO.字节流;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamFileOutputStreamCopyTest {

    private static Logger logger = Logger.getLogger(FileInputStreamFileOutputStreamCopyTest.class);

    @Test
    public void FileInputStreamFileOutputStreamCopy(){

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            logger.info("复制文件开始...");

            String sourcePath = "E:\\IO\\FileOutputStream.txt";
            String targetPath = "E:\\IO\\FileOutputStreamCopy.txt";

            fileInputStream = new FileInputStream(sourcePath);
            fileOutputStream = new FileOutputStream(targetPath);
            byte[] buf = new byte[1024];
            int temp =0;
            while ((temp = fileInputStream.read(buf))!= -1){
                fileOutputStream.write(buf,0,temp);
                logger.info(new String(buf,0,temp));
            }

            logger.info("复制文件结束...");
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
