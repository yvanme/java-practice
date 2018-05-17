package com.loong.IO.字符流;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.*;

public class BufferedReaderBufferedWriterCopyTest {

    private static Logger logger = Logger.getLogger(BufferedReaderBufferedWriterCopyTest.class);

    @Test
    public void testWriterFile(){

        FileReader fileReader =null;
        FileWriter fileWriter =null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            logger.info("复制文件开始...");

            String sourcePath = "E:\\IO\\FileWriter.txt";
            String targetPath = "E:\\IO\\BufferedReaderBufferedWriterCopyTest.txt";

            fileReader = new FileReader(sourcePath);
            fileWriter = new FileWriter(targetPath);
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            while ((line=bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                logger.info(line);
            }
            logger.info("复制文件结束...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
