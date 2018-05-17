package com.loong.IO.字符流;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileWriterCopyTest {

    private static Logger logger = Logger.getLogger(FileReaderFileWriterCopyTest.class);

    @Test
    public void testWriterFile(){

        FileReader fileReader =null;
        FileWriter fileWriter =null;

        try {
            logger.info("复制文件开始...");

            String sourcePath = "E:\\IO\\FileWriter.txt";
            String targetPath = "E:\\IO\\FileWriterCopy.txt";

            fileReader = new FileReader(sourcePath);
            fileWriter = new FileWriter(targetPath);
            char[] buf = new char[1024];
            int temp = 0;
            while ((temp=fileReader.read(buf))!=-1){
                String str = new String(buf,0,temp);
                fileWriter.write(str);
                logger.info(str);
            }
            logger.info("复制文件结束...");
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
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
