package com.loong.IO.字节流;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.*;

public class BufferedInputStreamBufferedOutputStreamCopyTest {

    private static Logger logger = Logger.getLogger(BufferedInputStreamBufferedOutputStreamCopyTest.class);

    @Test
    public void BufferedInputStreamBufferedOutputStreamCopy(){

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            logger.info("复制文件开始...");

            String sourcePath = "E:\\IO\\FileOutputStream.txt";
            String targetPath = "E:\\IO\\FileOutputStreamCopy.txt";

            fileInputStream = new FileInputStream(sourcePath);
            fileOutputStream = new FileOutputStream(targetPath);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] buf = new byte[1024];
            int temp =0;
            while ((temp = bufferedInputStream.read(buf))!= -1){
                bufferedOutputStream.write(buf,0,temp);
                logger.info(new String(buf,0,temp));
            }

            logger.info("复制文件结束...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream!=null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream!=null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
