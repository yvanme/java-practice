package com.loong.IO;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

    private static Logger logger = Logger.getLogger(FileReaderTest.class);

    @Test
    public void testWriterFile(){

        FileReader fileReader =null;

        try {
            logger.info("使用FileReader读文件开始...");

            String path = "E:\\IO\\FileWriter.txt";

            fileReader = new FileReader(path);
            char[] buf = new char[1024];
            int temp = 0;
            while ((temp=fileReader.read(buf))!=-1){
                logger.info(new String(buf,0,temp));
            }

            logger.info("使用FileReader读入文件结束...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
